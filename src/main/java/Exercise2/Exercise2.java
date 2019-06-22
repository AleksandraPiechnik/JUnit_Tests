package Exercise2;

import com.sun.javaws.exceptions.InvalidArgumentException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise2 {

    int solution(List<Integer> list) throws EmptyArrayException, ArraySizeException {

        int min=1;

        if(list.size()==0) throw new EmptyArrayException();
        if(list.size()>100000) throw new ArraySizeException();
        else
        {

            List <Integer>list2=new ArrayList<Integer>(list);
            Collections.sort(list2);

            for (int i = 0; i <list2.size()-1 ; i++) {

                if((int)list2.get(i)>0 && (int)list2.get(i)==min )
                {
                    if((int)list2.get(i) != (int)list2.get(i+1) && (int)list2.get(i)+1!=(int)list2.get(i+1))
                    {
                        return (int)list2.get(i)+1;
                    }
                    else
                    {
                        if((int)list2.get(i)+1==(int)list2.get(i+1))
                        {
                            min=(int)list2.get(i+1);
                            if(min==(int)list2.get(list.size()-1)) min+=1;
                        }
                    }
                }
                else
                {
                    if((int)list2.get(i)>0)
                    {
                        if(min==(int)list2.get(list.size()-1)) return min+1;
                        else return min;
                    }
                }
            }

        }



        return min;
    }
}
