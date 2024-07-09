import jakarta.el.ExpressionFactory;
import jakarta.el.StandardELContext;
import jakarta.el.ValueExpression;

import java.util.List;

public class ListWithEL {
    public static void main(String[] args) {
        ExpressionFactory ef = ExpressionFactory.newInstance();
        StandardELContext context = new StandardELContext(ef);
        ValueExpression ve = ef.createValueExpression(context, "${[10,20,30,40]}", List.class);
        List<Long> list = ve.getValue(context);
        list.forEach(System.out::println);
    }
}
