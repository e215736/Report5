package Report5;

public class Exception {
     public static void main(String[] args){
        String str;
        str = null;
        try{System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("例外発生だあああ！");
            System.out.println(e.getMessage());

        }
     }

}
