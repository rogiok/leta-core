package leta.core.model;

import java.util.ArrayList;

public class MatrixItem {
    
    private ArrayList<Object> columns;

    public MatrixItem(ArrayList<Object> columns) {
	super();

	this.columns = columns;
    }

    public MatrixItem() {
	this(new ArrayList<Object>());
    }

    public void addColumn(Object obj) {
	this.columns.add(obj);
    }

    public void addColumns(ArrayList<Object> objs) {
	this.columns.addAll(objs);
    }

    public Object getColumn(int index) {
	if (index >= columns.size())
	    return null;
	else
	    return columns.get(index);
    }

    public ArrayList<Object> getColumns() {
	return columns;
    }

    public void setColumns(ArrayList<Object> columns) {
	this.columns = columns;
    }
}