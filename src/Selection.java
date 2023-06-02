public class Selection {
    public static void main(String[] args) {
        var a=1;
        var b=2;

        if (a>b){
            System.out.println(a);
        } else{
            System.out.println(b);
        }

        switch (a){
            case 1: 
                System.out.println('a');
                break;
            case 2:
                System.out.println('b');
                break;
            default:
            System.out.println('c');
            
        }
    }
}
