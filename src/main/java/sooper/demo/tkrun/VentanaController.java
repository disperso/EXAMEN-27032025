package sooper.demo.tkrun;

public class VentanaController {
	

		private VentanaModel model2;
		private VentanaView view2;
		
			
		public void setVistaModel( VentanaView v , VentanaModel m) {
			this.model2 = m;
			this.view2 = v;
			//no hay inicializacion especifica del modelo, solo de la vista
			this.view2.getFrame().setVisible(true);
		}
	
	
		
		
		
		
		
		
	
	

}
