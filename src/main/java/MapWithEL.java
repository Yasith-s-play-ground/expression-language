import jakarta.el.ExpressionFactory;
import jakarta.el.StandardELContext;
import jakarta.el.ValueExpression;

import java.util.Map;
import java.util.Set;

public class MapWithEL {
    public static void main(String[] args) {
        ExpressionFactory ef = ExpressionFactory.newInstance();
        StandardELContext context = new StandardELContext(ef);
        ValueExpression ve = ef.createValueExpression(context, "${{'first':1,'second':2,'third':3,'fourth':4,'first':10}}", Map.class);
        Map<String, Long> myMap = ve.getValue(context);
        System.out.println(myMap); //{third=3, fourth=4, first=10, second=2}
    }
}
