package assignment.wizardPages;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;

public class EnterDate extends WizardPage{

	public EnterDate() {
		super("page");
		setTitle("Enter Details");
		setDescription("Enter travel agent and date of the tour");
		// TODO Auto-generated constructor stub
	}

	private Combo name;
	private Label agent;
	private Label ldate;
	DateTime date;
	private Composite page;
	
	final static String[] names = {"goibibo","redbus","yatra"};
	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		page = new Composite(parent, SWT.NULL);
		GridLayout grid = new GridLayout();
		page.setLayout(grid);
		grid.numColumns=2;
		
		agent = new Label(page,SWT.None);
		agent.setText("Select Agent");
		
		name = new Combo(page, SWT.BORDER|SWT.READ_ONLY);
		GridData data = new GridData();
		name.setLayoutData(data);
		name.setItems(names);
		
		ldate = new Label(page,SWT.NONE);
		ldate.setText("Enter Date");
		
		date = new DateTime(page, SWT.CALENDAR);
		
		setControl(page);
		setPageComplete(true);
		
	}
	
	
	public String getName(){
		return name.getText();
	}

	public String getDate(){
		String fetch_date;
		String year;
		String month;
		String day;
		
		year = "" + date.getYear();
		month = ""+date.getMonth();
		day = ""+date.getDay();
		
		fetch_date = year +"-"+ month +"-"+ day;
		return fetch_date;		
		
	}
}

