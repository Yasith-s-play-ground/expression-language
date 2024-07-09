import jakarta.el.ExpressionFactory;
import jakarta.el.StandardELContext;
import jakarta.el.ValueExpression;

public class ELOperators {
    public static void main(String[] args) {
        ExpressionFactory ef = ExpressionFactory.newInstance();
        StandardELContext context = new StandardELContext(ef);
        /* addition int */
        ValueExpression ve1 = ef.createValueExpression(context, "${10 + 5}", int.class);
        int value1 = ve1.getValue(context);
        System.out.println(value1);

        /* subtraction */
        ValueExpression ve2 = ef.createValueExpression(context, "${10 - 5}", int.class);
        int value2 = ve2.getValue(context);
        System.out.println(value2);

        /* addition float */
        ValueExpression ve3 = ef.createValueExpression(context, "${10 + 15.2}", float.class);
        float value3 = ve3.getValue(context);
        System.out.println(value3);

        /* multiplication */
        ValueExpression ve4 = ef.createValueExpression(context, "${10 * 2}", int.class);
        int value4 = ve4.getValue(context);
        System.out.println(value4);

        /* division */
        ValueExpression ve5 = ef.createValueExpression(context, "${100 / 2}", int.class);
        int value5 = ve5.getValue(context);
        System.out.println(value5);

        ValueExpression ve6 = ef.createValueExpression(context, "${100 div 2}", int.class);
        int value6 = ve6.getValue(context);
        System.out.println(value6);

        /* mod */
        ValueExpression ve7 = ef.createValueExpression(context, "${11 % 7}", int.class);
        int value7 = ve7.getValue(context);
        System.out.println(value7);

        ValueExpression ve8 = ef.createValueExpression(context, "${11 mod 7}", int.class);
        int value8 = ve8.getValue(context);
        System.out.println(value8);

        /* String concat */
        ValueExpression ve9 = ef.createValueExpression(context, "${'ij'+='se'}", String.class);
        String value9 = ve9.getValue(context);
        System.out.println(value9);
    }
}

/*
15
5
25.2
20
50
50
4
4
ijse
*/
