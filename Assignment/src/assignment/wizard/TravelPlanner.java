package assignment.wizard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import com.mysql.jdbc.ResultSet;

import database.Connect;

import assignment.wizardPages.EnterDate;
import assignment.wizardPages.EnterPlace;
import assignment.wizardPages.EnterTour;

public class TravelPlanner extends Wizard implements INewWizard {

	protected EnterDate enterDate;
	protected EnterPlace enterPlace;
	protected EnterTour enterTour;
	
	
	
	
	public TravelPlanner() {
		super();
		setNeedsProgressMonitor(true);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPages() {
		// TODO Auto-generated method stub
		enterDate = new EnterDate();
		enterPlace = new EnterPlace();
		enterTour = new EnterTour();
		
		addPage(enterTour);
		addPage(enterPlace);
		addPage(enterDate);
	}

		@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		System.out.println(enterDate.getDate());
		System.out.println(enterDate.getName());
		System.out.println(enterTour.getTour());
		System.out.println(enterPlace.getSrc());
		System.out.println(enterPlace.getDest());
		System.out.println(enterPlace.getVia());
		
		String query;
		//Connection conn;
		//Statement stmt;
		//ResultSet rs = null;
		query =  "insert into travelplanner (tour_name,tour_src,tour_dest,tour_via,tour_tagent,tour_date) values ('"+ enterTour.getTour() +"','"+ enterPlace.getSrc() +"','"+ enterPlace.getDest() +"','"+ enterPlace.getVia() +"','"+ enterDate.getName() +"','"+ enterDate.getDate() +"')";
		//int c;
		System.out.println(""+query);
		Connect c=new Connect();
		try {
			c.dml(query);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return true;
		}


}
