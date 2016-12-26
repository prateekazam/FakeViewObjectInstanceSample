package view.java.util;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.binding.BindingContainer;

public class JavaUtil {
    public JavaUtil() {
        super();
    }


    public static Object resolveExpression(String expression) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        Application app = facesContext.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = facesContext.getELContext();
        ValueExpression valueExp = elFactory.createValueExpression(elContext, expression, Object.class);
        return valueExp.getValue(elContext);
    }

    public static BindingContainer getBindingContainer() {
        return (BindingContainer) resolveExpression("#{bindings}");
    }

}
