import jakarta.el.ExpressionFactory;
import jakarta.el.StandardELContext;
import jakarta.el.ValueExpression;

public class HelloEL {
    public static void main(String[] args) {
        ExpressionFactory ef = ExpressionFactory.newInstance(); //creating expression factory
        StandardELContext context = new StandardELContext(ef); // need context to create expression
        ValueExpression ve = ef.createValueExpression(context, "#{'hello' += ' el'}", String.class);
        Object value = ve.getValue(context);
        System.out.println(value);
    }
}
