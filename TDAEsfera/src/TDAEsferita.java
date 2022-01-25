public class TDAEsferita {
    private final double radio;

    /**
     *
     * @param radioinicial
     */
    public TDAEsferita(double radioinicial){
       if (radioinicial > 0){
          this.radio= radioinicial; 
    }   else {
            this.radio = 0;
             
    }   
}  
    public  double getradio(){
        return this.radio;
        
    }
    public double getdiametro(){
        return (2*radio);
    }
    public double getcircunferencia(){
        return (4*3.1416*radio*radio);
    }
    public double getarea(){
        return (4*3.1416*radio*radio);
    }
    public double getvolumen (){
        return (4*3.1416*Math.pow(radio, 3))/3;
    }       
}
