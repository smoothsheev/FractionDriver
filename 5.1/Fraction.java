class Fraction {
    
    private int num; //numerator
    private int den; //denominator
    
    //Constructos
    public Fraction() {        
        this.num = 1;
        this.den = 1;
        if (den == 0) {
            den = 1;
            System.out.println("Error. Denominator was set to 0, reset to 1");
        }
    }
    
     public Fraction(int n, int d) {
        this.num = n;
        this.den = d;  
        if (den == 0) {
            System.out.println("Error. Denominator was set to 0, reset to 1");
            den = 1;
        }
    }
    
    public Fraction(String c) {
       int slashIndex = c.indexOf("/");
       String n = c.substring(0, slashIndex);
       String d = c.substring(slashIndex);
      this.num = Integer.parseInt(n);
      this.den =  Integer.parseInt(d);  
      if (this.den == 0){
          den = 1; 
          System.out.println("Error. Denominator was set to 0, reset to 1");
        }
    }
    
    public Fraction(Fraction f) {
     this.num = f.num;
     this.den = f.den;
      if (this.den == 0) {
          den = 1; 
          System.out.println("Error. Denominator was set to 0, reset to 1");
        }
    }
    //Accesors
    public int getNum() {
     return this.num;   
    }
     public int getDenom() {
     return this.den;   
    }
    public String toString() {
    return this.num + "/" + this.den;    
    }
    public double toDouble() {
     double decNum;
     decNum = this.num;
     return decNum/this.den;
}
    //helper
    private int GCF(int a, int b) {   
    while (a != b) {
    if (b > a) {
    b = b - a;   
    }
    if (a > b) {
    a = a - b;   
    }
    }
    return a;
    }
    //Mutators
    public void reduce() {
    if (this.num == 0 || this.den == 0) {
    } else {
    this.num = num / GCF(num, den);
    this.den = den / GCF(num, den);
    }
    }
    
    public void setNum(int num) {
    this.num = num;
    }
    public void setDenom(int den) {
    if (den != 0) {
    this.den = den;
    }
    else System.out.println("Error. Denominator was set to 0, reset to 1");
    this.den = 1;
    }
     public void multiply (Fraction a) {
    this.num = this.num * a.num;
    this.den = this.den * a.den;    
    this.reduce();
        }
    //Statics
   
    public static Fraction multiply (Fraction a, Fraction b) {
    int ansNum = a.num * b.num;
    int ansDen = a.den * b.den;
    Fraction ans = new Fraction(ansNum, ansDen);
    ans.reduce();
    return ans;
    }
     public static Fraction divide (Fraction a, Fraction b) {
    int ansNum = a.num * b.den;
    int ansDen = a.den * b.num;
    Fraction ans = new Fraction(ansNum, ansDen);
    ans.reduce();
    return ans;
    }
    public static Fraction add (Fraction a, Fraction b) {
    int ansNum = a.num * b.den + b.num * a.den;
    int ansDen = a.den * b.den;
    Fraction ans = new Fraction(ansNum, ansDen);
    ans.reduce();
    return ans;
    }
    public static Fraction subtract (Fraction a, Fraction b) {
    int ansNum = a.num * b.den - b.num * a.den;
   
    int ansDen = a.den * b.den;
    
    Fraction ans = new Fraction(ansNum, ansDen);
    ans.reduce();
    return ans;
    }
}