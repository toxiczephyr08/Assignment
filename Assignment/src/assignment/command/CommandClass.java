package assignment.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.handlers.HandlerUtil;

import assignment.wizard.TravelPlanner;

public class CommandClass extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		
		TravelPlanner plan = new TravelPlanner();
		WizardDialog wiz = new WizardDialog(HandlerUtil.getActiveShell(event), plan);
		wiz.open();
		return null;
	}

}
