package dz6;
import dz6.Model.DivModel;
import dz6.Model.MultModel;
import dz6.Model.SubModel;
import dz6.Model.SumModel;
import dz6.Presenter.Presenter;
import dz6.View.View;

public class Program {
    public static void main(String[] args) {
        Presenter sum = new Presenter(new SumModel(), new View());
        Presenter mult = new Presenter(new MultModel(), new View());
        Presenter div = new Presenter(new DivModel(), new View());
        Presenter sub = new Presenter(new SubModel(), new View());
        
       while(true){ 
        switch (View.getMark()) {
            case '+':
                sum.buttonClick();
                break;
            case '-':
                sub.buttonClick();
                break;
            case '/':
                div.buttonClick();
                break;
            case '*':
                mult.buttonClick();
                break;
        }
        System.out.println("--------");
        continue;
    }
    }
}
