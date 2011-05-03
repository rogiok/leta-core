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
	if (index >= this.columns.size())
	    return null;
	else
	    return this.columns.get(index);
    }

    public ArrayList<Object> getColumns() {
	return this.columns;
    }
    
    public int sizeColumns() {
	return this.columns.size();
    }

    public void setColumns(ArrayList<Object> columns) {
	this.columns = columns;
    }
    
    public Object clone() {
	MatrixItem result = new MatrixItem();
	
	for (Object column : this.columns) {
	    if (column instanceof String)
		result.addColumn(new String((String) column));
	    if (column instanceof Integer)
		result.addColumn(new Integer(((Integer) column).intValue()));
	    if (column instanceof Double)
		result.addColumn(new Double(((Double) column).doubleValue()));
	    if (column instanceof Date)
		result.addColumn(new Date(((Date) column).getOriginal()));
	}
	
	return result;
    }
    
    public String toString() {
	return this.columns.toString();
    }
}