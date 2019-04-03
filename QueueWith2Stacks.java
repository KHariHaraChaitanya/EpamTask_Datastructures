import java.util.*;

public class QueueWith2Stacks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> one = new Stack<>();
        Stack <Integer> two = new Stack<>();
        int queries=sc.nextInt();
        for(int i=0;i<queries;i++){
            int option=sc.nextInt();
            if(option==1){
                one.push(sc.nextInt());
            }
            else if (option == 2)
            {
                if(two.isEmpty())
                {
                    while(!one.isEmpty())
                    {
                        two.push(one.pop());
                    }                    
                }
                
                if (!two.isEmpty()){                                
                    two.pop(); 
                }

            }
            else if (option == 3)
            {       
                if(two.isEmpty())
                {
                    while(!one.isEmpty())
                    {
                        two.push(one.pop());
                    }
                    System.out.println(two.peek());
                } 
                else 
                {
                    System.out.println(two.peek());
                }
            }
        }
    }
}