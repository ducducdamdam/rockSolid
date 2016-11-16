package solidCode.S;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clSolidEventController implements ActionListener {

    private frmSolid frmSolid ;

    public clSolidEventController() {
        frmSolid = new frmSolid(this);
        frmSolid.setVisible(true);
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("btnUp")) {
            frmSolid.getBtnUp().setVisible(false);
            frmSolid.getBtnDown().setVisible(true);
        } else {
            frmSolid.getBtnUp().setVisible(true);
            frmSolid.getBtnDown().setVisible(false);
        }
    }

}
