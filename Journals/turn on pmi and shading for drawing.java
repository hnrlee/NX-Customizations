// NX 1919
// Journal created by henryl01 on Wed Oct 12 16:53:40 2022 Pacific Daylight Time
//
import nxopen.*;
public class turn on pmi and shading for drawing
{
  public static void main(String [] args) throws NXException, java.rmi.RemoteException
  {
    nxopen.Session theSession = (nxopen.Session)nxopen.SessionFactory.get("Session");
    nxopen.Part workPart = theSession.parts().work();
    nxopen.Part displayPart = theSession.parts().display();
    // ----------------------------------------------
    //   Menu: Edit->View->Settings...
    // ----------------------------------------------
    int markId1;
    markId1 = theSession.setUndoMark(nxopen.Session.MarkVisibility.VISIBLE, "Start");
    
    nxopen.View [] views1  = new nxopen.View[1];
    nxopen.drawings.BaseView baseView1 = ((nxopen.drawings.BaseView)workPart.draftingViews().findObject("PMI Front@2"));
    views1[0] = baseView1;
    nxopen.drawings.EditViewSettingsBuilder editViewSettingsBuilder1;
    editViewSettingsBuilder1 = workPart.settingsManager().createDrawingEditViewSettingsBuilder(views1);
    
    theSession.setUndoMarkName(markId1, "Settings Dialog");
    
    nxopen.drafting.BaseEditSettingsBuilder [] editsettingsbuilders1  = new nxopen.drafting.BaseEditSettingsBuilder[1];
    editsettingsbuilders1[0] = editViewSettingsBuilder1;
    workPart.settingsManager().processForMultipleObjectsSettings(editsettingsbuilders1);
    
    editViewSettingsBuilder1.viewStyle().viewStyleShading().setRenderingStyle(nxopen.preferences.ShadingRenderingStyleOption.FULLY_SHADED); // This is what makes the part fully shaded
    
    // ----------------------------------------------
    //   Dialog Begin Settings
    // ----------------------------------------------
    editViewSettingsBuilder1.viewStyle().viewStyleInheritPmi().setPmi(nxopen.preferences.PmiOption.FROM_MODEL_VIEW); // This is what makes the pmi views come thru from 3D to the drawing
    
    int markId2;
    markId2 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Settings");
    
    theSession.deleteUndoMark(markId2, null);
    
    int markId3;
    markId3 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Settings");
    
    nxopen.NXObject nXObject1;
    nXObject1 = editViewSettingsBuilder1.commit();
    
    theSession.deleteUndoMark(markId3, null);
    
    theSession.setUndoMarkName(markId1, "Settings");
    
    editViewSettingsBuilder1.destroy();
    
    theSession.cleanUpFacetedFacesAndEdges();
    
    // ----------------------------------------------
    //   Menu: Tools->Journal->Stop Recording
    // ----------------------------------------------
  
  }
  
  public static final int getUnloadOption() { return nxopen.BaseSession.LibraryUnloadOption.IMMEDIATELY; }
  
}
