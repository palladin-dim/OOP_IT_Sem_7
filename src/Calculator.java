public class Calculator {

    private double res;

    public Calculator(double res){
        this.res = res;
    }

    public Calculator sum (double arg){
        res += arg;
        return this;
    }
    public Calculator multi(double arg){
        res *= arg;
        return this;
    }

    public double getResult(){
        return res;
    }

}
