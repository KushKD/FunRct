public class MainTwo {

    public static void main(String args[]){

        Long m = operationToDo((a,b,c)->a*b*c);
        Long n = operationToDo((a,b,c)->a+b+c);
        System.out.println(m);
        System.out.println(n);

        FunctionalGenerics<String,Integer> generics = (s)->s.length();
        generics.execute("Kush Kumar Dhawan");
        System.out.println(generics.execute("Kush Kumar Dhawan"));
    }

    static Long operationToDo(Operations operations){
        return operations.operation(123L,345L,213L);
    }
}
