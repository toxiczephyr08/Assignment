package assignment.wizardPages;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class EnterTour extends WizardPage{

	public EnterTour() {
		super("page");
		setTitle("Plan My Travel");
		setDescription("Enter details of your tour");
		// TODO Auto-generated constructor stub
	}

	private Label tourName;
	private Text tour;
	private Composite page;
	
	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		page = new Composite(parent, SWT.NULL);
		GridLayout grid = new GridLayout();
		page.setLayout(grid);
		grid.numColumns=2;
		
		tourName = new Label(page, SWT.NONE);
		tourName.setText("Enter tour name");
		
		tour = new Text(page,SWT.BORDER|SWT.SINGLE);
		tour.setText("");
		
		tour.addKeyListener(new KeyListener() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(!tour.getText().isEmpty()){
					setPageComplete(true);
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		tourName.setLayoutData(data);
		
		setControl(page);
		setPageComplete(false);
		
	}

	public String getTour(){
		return tour.getText();
	}
	
	
}
