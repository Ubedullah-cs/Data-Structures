class Fact {
    int   fact(int n){
       if(n==0){
      return 1;}
    
else{
    int fn1= fact(n-1);
  
    int fn= n*fact(n-1);
    return fn;
      }
    }
    
    public static void main(String[] args) {
     Fact f=new Fact();  
System.out.println(f.fact(5));

}
}