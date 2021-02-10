class FractionDriver {
    
    public static void main(String[] args) {
        Fraction myFraction = new Fraction(1, 3);
        Fraction yourFraction = new Fraction(1,2);
        
        Fraction f1 = new Fraction(myFraction);
        Fraction f2 = new Fraction(yourFraction);
        
        
        Fraction answer = Fraction.multiply(f1, f2);
        System.out.println(answer);
        
    }
    
}