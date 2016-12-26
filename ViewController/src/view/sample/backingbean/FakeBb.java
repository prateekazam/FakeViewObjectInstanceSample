package view.sample.backingbean;

import javax.faces.event.ActionEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import view.java.util.JavaUtil;

public class FakeBb {
    public FakeBb() {
        super();
       
    }

    public void fakeButtonClick(ActionEvent actionEvent) {
        BindingContainer bindingContainer = JavaUtil.getBindingContainer();
        OperationBinding binding = bindingContainer.getOperationBinding("callingFakeMethod");
        binding.execute();
    }
    
    public void realButtonClick(ActionEvent actionEvent) {
        BindingContainer bindingContainer = JavaUtil.getBindingContainer();
        OperationBinding binding = bindingContainer.getOperationBinding("moduleMethod");
        binding.execute();
    }
}
