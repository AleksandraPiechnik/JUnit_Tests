package Exercise3;

public class Exercise3 {
    public int substring(String a, String b)
    {
        int ile=1;
        int aSize=a.length();
        String tempA =a;


        while(aSize<=(a.length()+b.length()+1))
        {
            if(tempA.contains(b)) return ile;
            else
            {
                aSize+=a.length();
                tempA+=a;
                ile++;
            }
        }

        return-1;

    }

}
