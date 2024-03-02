class Lab5c
{
    public static void main(String[] args) {
        int count=0;
        for(int i=0; i<args.length; i++)
        {
            if(args[i]!="quit") 
            {
                for(int j=0; j<args[i].length(); j++)
                {
                    if(args[i].charAt(j)=='a' || args[i].charAt(j)=='e' || args[i].charAt(j)=='i' || args[i].charAt(j)=='o' || args[i].charAt(j)=='u' || args[i].charAt(j)=='A' ||
                    args[i].charAt(j)=='E' || args[i].charAt(j)=='I' || args[i].charAt(j)=='O' || args[i].charAt(j)=='U')
                    {
                        count++;     
                    }
                }    
            }
        }
        System.out.println("Vowel : "+count);
    }
}