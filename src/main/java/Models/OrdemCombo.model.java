package br.com.combox.model;
 
import java.util.ArrayList;
import java.util.List;
 
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
 
import br.com.combox.modelo.Estados;
 
public class EstadosComboModel extends AbstractListModel<Object> implements ComboBoxModel<Object> {
 
    private List<Estados> listEstados;
    private Estados selectedEstado;
    private final static int FIRSTINDEX = 0;
 
    public EstadosComboModel() {
        this.listEstados = new ArrayList<Estados>();
    }
     
    public EstadosComboModel(List<Estados> listEstados) {
        this();
        this.listEstados.addAll(listEstados);
        if (getSize() > 0) { 
            setSelectedItem(this.listEstados.get(FIRSTINDEX));
        }
    }
     
    @Override
    public Object getElementAt(int index) {
        return listEstados.get(index);
    }
 
    @Override
    public int getSize() {
        return listEstados.size();
    }
 
    @Override
    public Object getSelectedItem() {
        return selectedEstado;
    }
 
    @Override
    public void setSelectedItem(Object anItem) {
        selectedEstado = (Estados) anItem;
    }
     
    public void addEstado(Estados estado) {
        listEstados.add(estado);
        fireIntervalAdded(this, getSize() - 1, getSize() - 1);
        setSelectedItem(listEstados.get(getSize() - 1));
    }
     
    public void addListEstado(List<Estados> estados) {
        int primeiraLinha = getSize();
        listEstados.addAll(estados);
        fireIntervalAdded(this, primeiraLinha, primeiraLinha  + estados.size());
        setSelectedItem(listEstados.get(getSize() - 1));
    }
     
    public void removeEstado() {
        listEstados.remove(getSelectedItem());
        fireIntervalRemoved(this, FIRSTINDEX, getSize() - 1);
        setSelectedItem(listEstados.get(FIRSTINDEX));
    }
     
    public void clear() {
        listEstados.clear();
        fireContentsChanged(this, FIRSTINDEX, getSize() - 1);
    }
}