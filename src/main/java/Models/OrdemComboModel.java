
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class OrdemComboModel extends AbstractListModel<OrdemServico> implements ComboBoxModel<OrdemServico> {

    private ArrayList<OrdemServico> listOrdem;
    private OrdemServico selectedOrdem;
    private final static int FIRSTINDEX = 0;

    public OrdemComboModel() {
        this.listOrdem = new ArrayList<OrdemServico>();
    }

    public OrdemComboModel(ArrayList<OrdemServico> listOrdem) {
        this();
        this.listOrdem.addAll(listOrdem);
        if (getSize() > 0) {
            setSelectedItem(this.listOrdem.get(FIRSTINDEX));
        }
    }

    @Override
    public OrdemServico getElementAt(int index) {
        return listOrdem.get(index);
    }

    @Override
    public int getSize() {
        return listOrdem.size();
    }

    @Override
    public Object getSelectedItem() {
        return selectedOrdem;
    }

    @Override
    public void setSelectedItem(OrdemServico anItem) {
        selectedOrdem = (OrdemServico) anItem;
    }

    public void addEstado(OrdemServico estado) {
        listOrdem.add(estado);
        fireIntervalAdded(this, getSize() - 1, getSize() - 1);
        setSelectedItem(listOrdem.get(getSize() - 1));
    }

    public void addListEstado(ArrayList<OrdemServico> estados) {
        int primeiraLinha = getSize();
        listOrdem.addAll(estados);
        fireIntervalAdded(this, primeiraLinha, primeiraLinha + estados.size());
        setSelectedItem(listOrdem.get(getSize() - 1));
    }

    public void removeEstado() {
        listOrdem.remove(getSelectedItem());
        fireIntervalRemoved(this, FIRSTINDEX, getSize() - 1);
        setSelectedItem(listOrdem.get(FIRSTINDEX));
    }

    public void clear() {
        listOrdem.clear();
        fireContentsChanged(this, FIRSTINDEX, getSize() - 1);
    }
}