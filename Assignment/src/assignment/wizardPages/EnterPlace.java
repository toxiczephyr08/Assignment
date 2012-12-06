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

public class EnterPlace extends WizardPage{

	public EnterPlace() {
		super("page");
		setTitle("Enter Source-Destination");
		setDescription("Enter places of the tour");
		// TODO Auto-generated constructor stub
	}

	private Label lsrc;
	private Label ldest;
	private Label lvia;
	private Text tsrc;
	private Text tdest;
	private Text tvia;
	private Composite page;
	
	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		page = new Composite(parent, SWT.NULL);
		GridLayout grid = new GridLayout();
		page.setLayout(grid);
		grid.numColumns=2;
		
		lsrc= new Label(page, SWT.NONE);
		lsrc.setText("Source");
		
		tsrc = new Text(page, SWT.BORDER|SWT.SINGLE);
		tsrc.setText("");
		
		ldest= new Label(page, SWT.NONE);
		ldest.setText("Destination");
		
		tdest = new Text(page, SWT.BORDER|SWT.SINGLE);
		tdest.setText("");
		
		lvia= new Label(page, SWT.NONE);
		lvia.setText("Via");
		
		tvia = new Text(page, SWT.BORDER|SWT.SINGLE);
		tvia.setText("");
		
		
		
		tsrc.addKeyListener(new KeyListener() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(!tsrc.getText().isEmpty()){
					setPageComplete(true);
				}
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		tdest.addKeyListener(new KeyListener() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(!tdest.getText().isEmpty()){
					setPageComplete(true);
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		tsrc.setLayoutData(data);
		tdest.setLayoutData(data);
		tvia.setLayoutData(data);
		
		setControl(page);
		setPageComplete(false);
	}

	public String getSrc(){
		return tsrc.getText();
	}
	
	public String getDest(){
		return tdest.getText();
	}
	
	public String getVia(){
		return tvia.getText();
	}
	
}
