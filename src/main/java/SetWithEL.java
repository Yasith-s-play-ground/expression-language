import jakarta.el.ExpressionFactory;
import jakarta.el.StandardELContext;
import jakarta.el.ValueExpression;

import java.util.List;
import java.util.Set;

public class SetWithEL {
    public static void main(String[] args) {
        ExpressionFactory ef = ExpressionFactory.newInstance();
        StandardELContext context = new StandardELContext(ef);
        ValueExpression ve = ef.createValueExpression(context, "${{'dep','cmjd','gdse','ijse','cmjd'}}", Set.class);
        Set<String> set = ve.getValue(context);
        set.forEach(System.out::println);
    }
}

/*
*
* output
ijse
cmjd
dep
gdse
* */