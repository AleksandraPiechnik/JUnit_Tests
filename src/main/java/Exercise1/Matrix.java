package Exercise1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Matrix<T>  {

    private int rows;
    private int cols;

    List<List<T>> mat ;

    public Matrix(int rows, int cols)
    {
        this.rows=rows;
        this.cols=cols;

        mat = new ArrayList<List<T>>(rows);
        for (int i = 0; i < rows; i++) {
            mat.add(i,new ArrayList<T>(cols));
        }
    }


    public void show()
    {
        Iterator iterator = mat.iterator();
        while (iterator.hasNext()) {
            Iterator iterator2 = ((List<T>) iterator.next()).iterator();
            while(iterator2.hasNext()) {
                System.out.print(iterator2.next().toString()+"\t");
            }
            System.out.println(" ");
        }
    }
    public Matrix addMatrix(Matrix<T> m) throws MatrixDimensionMissmatchException
    {

        if(this.getRows()==m.getRows()&&this.getCols()==m.getCols()) {
            for (int i = 0; i < this.getRows(); i++) {
                for (int j = 0; j < this.getCols(); j++) {
                    if(this.mat.get(i).get(j) instanceof  Integer && m.mat.get(i).get(j) instanceof  Integer){
                        this.mat.get(i).set(j, (T)new Integer(((Integer) this.mat.get(i).get(j)).intValue() + ((Integer) m.mat.get(i).get(j)).intValue()));
                    }
                    else if(this.mat.get(i).get(j) instanceof  String && m.mat.get(i).get(j) instanceof  String)
                    {
                        this.mat.get(i).set(j, (T)new String(((String) this.mat.get(i).get(j)).toString() + ((String) m.mat.get(i).get(j)).toString()));
                    }
                    else
                    {
                        throw new IllegalArgumentException("Type " + m.getClass() + " is not supported by this method");
                    }
                }
            }
        }
        else
        {
            System.out.println("In order to add matrix, rows and columns of both matrices have to be equal");
            throw new MatrixDimensionMissmatchException();
        }
        return this;
    }







    public int getRows() {
        return rows;
    }
    public int getCols() {
        return cols;
    }


}
