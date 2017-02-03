package com.company.cpf.web.forms;

import com.haulmont.bpm.gui.form.ProcForm;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.TextField;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

public class MyCustomForm extends AbstractWindow implements ProcForm{

    @Inject
    private TextField myField;

    @Override
    public String getComment() {
        return "some comment";
    }

    @Override
    public Map<String, Object> getFormResult() {
        Map<String, Object> processVariables = new HashMap<>();
        processVariables.put("myField", myField.getValue());
        processVariables.put("otherVariable", 1);
        return processVariables;
    }

    public void onWindowCommit() {
        close(COMMIT_ACTION_ID);
    }

    public void onWindowClose() {
        close(CLOSE_ACTION_ID);
    }
}