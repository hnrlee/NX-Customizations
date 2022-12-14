// NX 1919
// Journal created by henryl01 on Wed Oct 12 15:57:15 2022 Pacific Daylight Time
//
import nxopen.*;
public class Hole Callout
{
  public static void main(String [] args) throws NXException, java.rmi.RemoteException
  {
    nxopen.Session theSession = (nxopen.Session)nxopen.SessionFactory.get("Session");
    nxopen.Part workPart = theSession.parts().work();
    nxopen.Part displayPart = theSession.parts().display();
    nxopen.Point3d scaleAboutPoint1 = new nxopen.Point3d(2.1393667536449672, -4.884214663983105, 0.0);
    nxopen.Point3d viewCenter1 = new nxopen.Point3d(-2.1393667536457222, 4.8842146639824442, 0.0);
    workPart.modelingViews().workView().zoomAboutPoint(0.80000000000000004, scaleAboutPoint1, viewCenter1);
    
    nxopen.Point3d scaleAboutPoint2 = new nxopen.Point3d(2.6742084420563068, -6.1052683299787915, 0.0);
    nxopen.Point3d viewCenter2 = new nxopen.Point3d(-2.6742084420570542, 6.1052683299781432, 0.0);
    workPart.modelingViews().workView().zoomAboutPoint(0.80000000000000004, scaleAboutPoint2, viewCenter2);
    
    nxopen.Point3d origin1 = new nxopen.Point3d(127.92864309782375, -33.220727557577966, -144.52078035341171);
    workPart.modelingViews().workView().setOrigin(origin1);
    
    nxopen.Point3d origin2 = new nxopen.Point3d(127.92864309782375, -33.220727557577966, -144.52078035341171);
    workPart.modelingViews().workView().setOrigin(origin2);
    
    theSession.cleanUpFacetedFacesAndEdges();
    
    nxopen.Point3d scaleAboutPoint3 = new nxopen.Point3d(-8.3884368583385598, 4.2257539060798184, 0.0);
    nxopen.Point3d viewCenter3 = new nxopen.Point3d(8.3884368583378226, -4.2257539060804694, 0.0);
    workPart.modelingViews().workView().zoomAboutPoint(1.25, scaleAboutPoint3, viewCenter3);
    
    nxopen.Point3d scaleAboutPoint4 = new nxopen.Point3d(-6.7107494866709283, 3.7842572293251675, 0.0);
    nxopen.Point3d viewCenter4 = new nxopen.Point3d(6.7107494866701805, -3.7842572293258065, 0.0);
    workPart.modelingViews().workView().zoomAboutPoint(1.25, scaleAboutPoint4, viewCenter4);
    
    // ----------------------------------------------
    //   Menu: PMI->Dimension->Radial...
    // ----------------------------------------------
    int markId1;
    markId1 = theSession.setUndoMark(nxopen.Session.MarkVisibility.VISIBLE, "Start");
    
    nxopen.annotations.Dimension nullNXOpen_Annotations_Dimension = null;
    nxopen.annotations.PmiRadialDimensionBuilder pmiRadialDimensionBuilder1;
    pmiRadialDimensionBuilder1 = workPart.dimensions().createPmiRadialDimensionBuilder(nullNXOpen_Annotations_Dimension);
    
    String [] lines1  = new String[0];
    pmiRadialDimensionBuilder1.appendedText().setBefore(lines1);
    
    String [] lines2  = new String[0];
    pmiRadialDimensionBuilder1.appendedText().setAfter(lines2);
    
    String [] lines3  = new String[0];
    pmiRadialDimensionBuilder1.appendedText().setAbove(lines3);
    
    String [] lines4  = new String[0];
    pmiRadialDimensionBuilder1.appendedText().setBelow(lines4);
    
    pmiRadialDimensionBuilder1.origin().setInferRelativeToGeometry(true);
    
    pmiRadialDimensionBuilder1.origin().setAnchor(nxopen.annotations.OriginBuilder.AlignmentPosition.MID_CENTER);
    
    pmiRadialDimensionBuilder1.measurement().setMethod(nxopen.annotations.DimensionMeasurementBuilder.MeasurementMethod.HOLE_CALLOUT);
    
    pmiRadialDimensionBuilder1.setHoleStyle(true);
    
    String [] lines5  = new String[0];
    pmiRadialDimensionBuilder1.appendedText().setBefore(lines5);
    
    String [] lines6  = new String[0];
    pmiRadialDimensionBuilder1.appendedText().setAfter(lines6);
    
    String [] lines7  = new String[0];
    pmiRadialDimensionBuilder1.appendedText().setAbove(lines7);
    
    String [] lines8  = new String[0];
    pmiRadialDimensionBuilder1.appendedText().setBelow(lines8);
    
    theSession.setUndoMarkName(markId1, "Radial Dimension Dialog");
    
    pmiRadialDimensionBuilder1.origin().plane().setPlaneMethod(nxopen.annotations.PlaneBuilder.PlaneMethodType.MODEL_VIEW);
    
    pmiRadialDimensionBuilder1.origin().setInferRelativeToGeometry(true);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits1;
    dimensionlinearunits1 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits2;
    dimensionlinearunits2 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits3;
    dimensionlinearunits3 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits4;
    dimensionlinearunits4 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits5;
    dimensionlinearunits5 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits6;
    dimensionlinearunits6 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits7;
    dimensionlinearunits7 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits8;
    dimensionlinearunits8 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits9;
    dimensionlinearunits9 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits10;
    dimensionlinearunits10 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    pmiRadialDimensionBuilder1.origin().setInferRelativeToGeometry(true);
    
    pmiRadialDimensionBuilder1.origin().setInferRelativeToGeometry(true);
    
    nxopen.Direction nullNXOpen_Direction = null;
    pmiRadialDimensionBuilder1.measurement().setDirection(nullNXOpen_Direction);
    
    nxopen.View nullNXOpen_View = null;
    pmiRadialDimensionBuilder1.measurement().setDirectionView(nullNXOpen_View);
    
    pmiRadialDimensionBuilder1.style().dimensionStyle().setNarrowDisplayType(nxopen.annotations.NarrowDisplayOption.NONE);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits11;
    dimensionlinearunits11 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits12;
    dimensionlinearunits12 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits13;
    dimensionlinearunits13 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits14;
    dimensionlinearunits14 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits15;
    dimensionlinearunits15 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits16;
    dimensionlinearunits16 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits17;
    dimensionlinearunits17 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits18;
    dimensionlinearunits18 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits19;
    dimensionlinearunits19 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits20;
    dimensionlinearunits20 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.features.HolePackage holePackage1 = ((nxopen.features.HolePackage)workPart.features().findObject("THREADED HOLE(9)"));
    nxopen.Point3d point1 = new nxopen.Point3d(159.26499656132725, 17.328133110023479, -2.1801580862296372);
    pmiRadialDimensionBuilder1.firstAssociativity().setValue(holePackage1, workPart.modelingViews().workView(), point1);
    
    nxopen.assemblies.Component nullNXOpen_Assemblies_Component = null;
    pmiRadialDimensionBuilder1.measurement().setPartOccurrence(nullNXOpen_Assemblies_Component);
    
    nxopen.features.BodyFeature bodyFeature1 = ((nxopen.features.BodyFeature)workPart.features().findObject("THREADED HOLE(9:2A)"));
    nxopen.Point3d pickpoint1 = new nxopen.Point3d(159.26499656132725, 17.328133110023479, -2.1801580862296372);
    pmiRadialDimensionBuilder1.style().holeCalloutSettings().resetFromFeature(bodyFeature1, nullNXOpen_Assemblies_Component, workPart.modelingViews().workView(), pickpoint1);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits21;
    dimensionlinearunits21 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits22;
    dimensionlinearunits22 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    pmiRadialDimensionBuilder1.measurement().setPartOccurrence(nullNXOpen_Assemblies_Component);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits23;
    dimensionlinearunits23 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits24;
    dimensionlinearunits24 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits25;
    dimensionlinearunits25 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits26;
    dimensionlinearunits26 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits27;
    dimensionlinearunits27 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits28;
    dimensionlinearunits28 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.NXObject [] objects1  = new nxopen.NXObject[1];
    objects1[0] = bodyFeature1;
    pmiRadialDimensionBuilder1.associatedObjects().nxobjects().setArray(objects1);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits29;
    dimensionlinearunits29 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits30;
    dimensionlinearunits30 = pmiRadialDimensionBuilder1.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.Annotation.AssociativeOriginData assocOrigin1 = new nxopen.annotations.Annotation.AssociativeOriginData();
    assocOrigin1.originType = nxopen.annotations.AssociativeOriginType.DRAG;
    assocOrigin1.view = nullNXOpen_View;
    assocOrigin1.viewOfGeometry = nullNXOpen_View;
    nxopen.Point nullNXOpen_Point = null;
    assocOrigin1.pointOnGeometry = nullNXOpen_Point;
    nxopen.annotations.Annotation nullNXOpen_Annotations_Annotation = null;
    assocOrigin1.vertAnnotation = nullNXOpen_Annotations_Annotation;
    assocOrigin1.vertAlignmentPosition = nxopen.annotations.AlignmentPosition.TOP_LEFT;
    assocOrigin1.horizAnnotation = nullNXOpen_Annotations_Annotation;
    assocOrigin1.horizAlignmentPosition = nxopen.annotations.AlignmentPosition.TOP_LEFT;
    assocOrigin1.alignedAnnotation = nullNXOpen_Annotations_Annotation;
    assocOrigin1.dimensionLine = 0;
    assocOrigin1.associatedView = nullNXOpen_View;
    assocOrigin1.associatedPoint = nullNXOpen_Point;
    assocOrigin1.offsetAnnotation = nullNXOpen_Annotations_Annotation;
    assocOrigin1.offsetAlignmentPosition = nxopen.annotations.AlignmentPosition.TOP_LEFT;
    assocOrigin1.xOffsetFactor = 0.0;
    assocOrigin1.yOffsetFactor = 0.0;
    assocOrigin1.stackAlignmentPosition = nxopen.annotations.StackAlignmentPosition.ABOVE;
    pmiRadialDimensionBuilder1.origin().setAssociativeOrigin(assocOrigin1);
    
    nxopen.Point3d point2 = new nxopen.Point3d(188.13638193391108, -22.675542108369708, -0.5);
    pmiRadialDimensionBuilder1.origin().origin().setValue(null, nullNXOpen_View, point2);
    
    pmiRadialDimensionBuilder1.origin().setInferRelativeToGeometry(true);
    
    pmiRadialDimensionBuilder1.style().lineArrowStyle().setLeaderOrientation(nxopen.annotations.LeaderSide.RIGHT);
    
    pmiRadialDimensionBuilder1.style().dimensionStyle().setTextCentered(false);
    
    int markId2;
    markId2 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension");
    
    nxopen.NXObject nXObject1;
    nXObject1 = pmiRadialDimensionBuilder1.commit();
    
    theSession.deleteUndoMark(markId2, null);
    
    theSession.setUndoMarkName(markId1, "Radial Dimension");
    
    theSession.setUndoMarkVisibility(markId1, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    pmiRadialDimensionBuilder1.destroy();
    
    int markId3;
    markId3 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Start");
    
    nxopen.annotations.PmiRadialDimensionBuilder pmiRadialDimensionBuilder2;
    pmiRadialDimensionBuilder2 = workPart.dimensions().createPmiRadialDimensionBuilder(nullNXOpen_Annotations_Dimension);
    
    String [] lines9  = new String[0];
    pmiRadialDimensionBuilder2.appendedText().setBefore(lines9);
    
    String [] lines10  = new String[0];
    pmiRadialDimensionBuilder2.appendedText().setAfter(lines10);
    
    String [] lines11  = new String[0];
    pmiRadialDimensionBuilder2.appendedText().setAbove(lines11);
    
    String [] lines12  = new String[0];
    pmiRadialDimensionBuilder2.appendedText().setBelow(lines12);
    
    pmiRadialDimensionBuilder2.origin().setInferRelativeToGeometry(true);
    
    pmiRadialDimensionBuilder2.origin().setAnchor(nxopen.annotations.OriginBuilder.AlignmentPosition.MID_CENTER);
    
    pmiRadialDimensionBuilder2.measurement().setMethod(nxopen.annotations.DimensionMeasurementBuilder.MeasurementMethod.HOLE_CALLOUT);
    
    pmiRadialDimensionBuilder2.style().dimensionStyle().setLimitFitDeviation("H");
    
    pmiRadialDimensionBuilder2.style().dimensionStyle().setLimitFitShaftDeviation("g");
    
    nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype [] parameters1  = new nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype[9];
    parameters1[0] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.PATTERN_FEATURE_COUNT;
    parameters1[1] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.DIAMETER;
    parameters1[2] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.DEPTH;
    parameters1[3] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.LINE_BREAK;
    parameters1[4] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.COUNTER_BORE_DIAMETER;
    parameters1[5] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.COUNTER_BORE_DEPTH;
    parameters1[6] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.COUNTER_SINK_DIAMETER;
    parameters1[7] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.COUNTER_SINK_ANGLE;
    parameters1[8] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.TAPER_ANGLE;
    boolean orderischanged1;
    orderischanged1 = pmiRadialDimensionBuilder2.style().holeCalloutSettings().reorderParameters(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, parameters1);
    
    String [] lines13  = new String[1];
    lines13[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 0, lines13);
    
    String [] lines14  = new String[1];
    lines14[0] = " X";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 0, lines14);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 0, true);
    
    String [] lines15  = new String[1];
    lines15[0] = "<o> ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 1, lines15);
    
    String [] lines16  = new String[1];
    lines16[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 1, lines16);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 1, true);
    
    String [] lines17  = new String[1];
    lines17[0] = "<#D> ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 2, lines17);
    
    String [] lines18  = new String[1];
    lines18[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 2, lines18);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 2, true);
    
    String [] lines19  = new String[1];
    lines19[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 3, lines19);
    
    String [] lines20  = new String[1];
    lines20[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 3, lines20);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 3, false);
    
    String [] lines21  = new String[1];
    lines21[0] = "<#B><o> ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 4, lines21);
    
    String [] lines22  = new String[1];
    lines22[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 4, lines22);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 4, true);
    
    String [] lines23  = new String[1];
    lines23[0] = "<#D> ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 5, lines23);
    
    String [] lines24  = new String[1];
    lines24[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 5, lines24);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 5, true);
    
    String [] lines25  = new String[1];
    lines25[0] = "<#C><o> ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 6, lines25);
    
    String [] lines26  = new String[1];
    lines26[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 6, lines26);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 6, true);
    
    String [] lines27  = new String[1];
    lines27[0] = " X ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 7, lines27);
    
    String [] lines28  = new String[1];
    lines28[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 7, lines28);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 7, true);
    
    String [] lines29  = new String[1];
    lines29[0] = "<#E> ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 8, lines29);
    
    String [] lines30  = new String[1];
    lines30[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 8, lines30);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 8, true);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setThroughHoleTextOfType(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, "THRU");
    
    nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype [] parameters2  = new nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype[12];
    parameters2[0] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.PATTERN_FEATURE_COUNT; // TODO: Find way to grab the hole count parameter from the hole tool?
    parameters2[1] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.THREAD_SIZE;
    parameters2[2] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.THREAD_PITCH;
    parameters2[3] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.THREAD_DEPTH;
    parameters2[4] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.THREAD_FORM;
    parameters2[5] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.THREAD_INTERNAL_EXTERNAL_SYMBOL;
    parameters2[6] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.DEPTH;
    parameters2[7] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.PITCH;
    parameters2[8] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.ANGLE;
    parameters2[9] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.MINOR_DIAMETER;
    parameters2[10] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.MAJOR_DIAMETER;
    parameters2[11] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.TAP_DRILL_DIAMETER;
    boolean orderischanged2;
    orderischanged2 = pmiRadialDimensionBuilder2.style().holeCalloutSettings().reorderParameters(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, parameters2);
    
    String [] lines31  = new String[1];
    lines31[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 0, lines31);
    
    String [] lines32  = new String[1];
    lines32[0] = " X";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 0, lines32);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 0, true);
    
    String [] lines33  = new String[1];
    lines33[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 1, lines33);
    
    String [] lines34  = new String[1];
    lines34[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 1, lines34);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 1, true);
    
    String [] lines35  = new String[1];
    lines35[0] = "x";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 2, lines35);
    
    String [] lines36  = new String[1];
    lines36[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 2, lines36);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 2, true);
    
    String [] lines37  = new String[1];
    lines37[0] = "<#D> ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 3, lines37);
    
    String [] lines38  = new String[1];
    lines38[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 3, lines38);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 3, true);
    
    String [] lines39  = new String[1];
    lines39[0] = " ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 4, lines39);
    
    String [] lines40  = new String[1];
    lines40[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 4, lines40);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 4, false);
    
    String [] lines41  = new String[1];
    lines41[0] = "-2";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 5, lines41);
    
    String [] lines42  = new String[1];
    lines42[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 5, lines42);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 5, false);
    
    String [] lines43  = new String[1];
    lines43[0] = "<#D> ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 6, lines43);
    
    String [] lines44  = new String[1];
    lines44[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 6, lines44);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 6, false);
    
    String [] lines45  = new String[1];
    lines45[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 7, lines45);
    
    String [] lines46  = new String[1];
    lines46[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 7, lines46);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 7, false);
    
    String [] lines47  = new String[1];
    lines47[0] = " X ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 8, lines47);
    
    String [] lines48  = new String[1];
    lines48[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 8, lines48);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 8, false);
    
    String [] lines49  = new String[1];
    lines49[0] = "Minor:<o> ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 9, lines49);
    
    String [] lines50  = new String[1];
    lines50[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 9, lines50);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 9, false);
    
    String [] lines51  = new String[1];
    lines51[0] = "Major:<o> ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 10, lines51);
    
    String [] lines52  = new String[1];
    lines52[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 10, lines52);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 10, false);
    
    String [] lines53  = new String[1];
    lines53[0] = "Tap Drill:<o> ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 11, lines53);
    
    String [] lines54  = new String[1];
    lines54[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 11, lines54);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 11, false);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setThroughHoleTextOfType(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, "THRU");
    
    nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype [] parameters3  = new nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype[3];
    parameters3[0] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.PATTERN_FEATURE_COUNT;
    parameters3[1] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.DIAMETER;
    parameters3[2] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.DEPTH;
    boolean orderischanged3;
    orderischanged3 = pmiRadialDimensionBuilder2.style().holeCalloutSettings().reorderParameters(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, parameters3);
    
    String [] lines55  = new String[1];
    lines55[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, 0, lines55);
    
    String [] lines56  = new String[1];
    lines56[0] = " X";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, 0, lines56);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, 0, true);
    
    String [] lines57  = new String[1];
    lines57[0] = "<o> ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, 1, lines57);
    
    String [] lines58  = new String[1];
    lines58[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, 1, lines58);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, 1, true);
    
    String [] lines59  = new String[1];
    lines59[0] = "<#D> ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, 2, lines59);
    
    String [] lines60  = new String[1];
    lines60[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, 2, lines60);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, 2, true);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setThroughHoleTextOfType(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, "THRU");
    
    nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype [] parameters4  = new nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype[12];
    parameters4[0] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.PATTERN_FEATURE_COUNT;
    parameters4[1] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.CALLOUT;
    parameters4[2] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.SYMBOLIC_THREAD_PITCH;
    parameters4[3] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.SYMBOLIC_THREAD_FORM;
    parameters4[4] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.SYMBOLIC_THREAD_INTERNAL_EXTERNAL_SYMBOL;
    parameters4[5] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.LENGTH;
    parameters4[6] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.PITCH;
    parameters4[7] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.ANGLE;
    parameters4[8] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.MINOR_DIAMETER;
    parameters4[9] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.MAJOR_DIAMETER;
    parameters4[10] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.TAP_DRILL_DIAMETER;
    parameters4[11] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.SHAFT_SIZE;
    boolean orderischanged4;
    orderischanged4 = pmiRadialDimensionBuilder2.style().holeCalloutSettings().reorderParameters(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, parameters4);
    
    String [] lines61  = new String[1];
    lines61[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 0, lines61);
    
    String [] lines62  = new String[1];
    lines62[0] = " X";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 0, lines62);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 0, false);
    
    String [] lines63  = new String[1];
    lines63[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 1, lines63);
    
    String [] lines64  = new String[1];
    lines64[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 1, lines64);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 1, true);
    
    String [] lines65  = new String[1];
    lines65[0] = "x";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 2, lines65);
    
    String [] lines66  = new String[1];
    lines66[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 2, lines66);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 2, true);
    
    String [] lines67  = new String[1];
    lines67[0] = " ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 3, lines67);
    
    String [] lines68  = new String[1];
    lines68[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 3, lines68);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 3, false);
    
    String [] lines69  = new String[1];
    lines69[0] = "-2";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 4, lines69);
    
    String [] lines70  = new String[1];
    lines70[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 4, lines70);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 4, false);
    
    String [] lines71  = new String[1];
    lines71[0] = "<#D> ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 5, lines71);
    
    String [] lines72  = new String[1];
    lines72[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 5, lines72);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 5, false);
    
    String [] lines73  = new String[1];
    lines73[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 6, lines73);
    
    String [] lines74  = new String[1];
    lines74[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 6, lines74);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 6, false);
    
    String [] lines75  = new String[1];
    lines75[0] = " X ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 7, lines75);
    
    String [] lines76  = new String[1];
    lines76[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 7, lines76);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 7, false);
    
    String [] lines77  = new String[1];
    lines77[0] = "Minor:<o> ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 8, lines77);
    
    String [] lines78  = new String[1];
    lines78[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 8, lines78);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 8, false);
    
    String [] lines79  = new String[1];
    lines79[0] = "Major:<o> ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 9, lines79);
    
    String [] lines80  = new String[1];
    lines80[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 9, lines80);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 9, false);
    
    String [] lines81  = new String[1];
    lines81[0] = "Tap Drill:<o> ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 10, lines81);
    
    String [] lines82  = new String[1];
    lines82[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 10, lines82);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 10, false);
    
    String [] lines83  = new String[1];
    lines83[0] = "Shaft Size:<o> ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 11, lines83);
    
    String [] lines84  = new String[1];
    lines84[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 11, lines84);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 11, false);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setThroughHoleTextOfType(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, "");
    
    nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype [] parameters5  = new nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype[10];
    parameters5[0] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.PATTERN_FEATURE_COUNT;
    parameters5[1] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.DIAMETER;
    parameters5[2] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.DEPTH;
    parameters5[3] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.LINE_BREAK;
    parameters5[4] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.COUNTER_BORE_DIAMETER;
    parameters5[5] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.COUNTER_BORE_DEPTH;
    parameters5[6] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.COUNTER_SINK_DIAMETER;
    parameters5[7] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.COUNTER_SINK_ANGLE;
    parameters5[8] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.FIT;
    parameters5[9] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.SCREW_SIZE;
    boolean orderischanged5;
    orderischanged5 = pmiRadialDimensionBuilder2.style().holeCalloutSettings().reorderParameters(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, parameters5);
    
    String [] lines85  = new String[1];
    lines85[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 0, lines85);
    
    String [] lines86  = new String[1];
    lines86[0] = "X";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 0, lines86);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 0, true);
    
    String [] lines87  = new String[1];
    lines87[0] = "<o> ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 1, lines87);
    
    String [] lines88  = new String[1];
    lines88[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 1, lines88);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 1, true);
    
    String [] lines89  = new String[1];
    lines89[0] = "<#D>";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 2, lines89);
    
    String [] lines90  = new String[1];
    lines90[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 2, lines90);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 2, true);
    
    String [] lines91  = new String[1];
    lines91[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 3, lines91);
    
    String [] lines92  = new String[1];
    lines92[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 3, lines92);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 3, false);
    
    String [] lines93  = new String[1];
    lines93[0] = "<#B><o>";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 4, lines93);
    
    String [] lines94  = new String[1];
    lines94[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 4, lines94);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 4, true);
    
    String [] lines95  = new String[1];
    lines95[0] = "<#D>";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 5, lines95);
    
    String [] lines96  = new String[1];
    lines96[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 5, lines96);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 5, true);
    
    String [] lines97  = new String[1];
    lines97[0] = "<#C><o>";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 6, lines97);
    
    String [] lines98  = new String[1];
    lines98[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 6, lines98);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 6, true);
    
    String [] lines99  = new String[1];
    lines99[0] = "X";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 7, lines99);
    
    String [] lines100  = new String[1];
    lines100[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 7, lines100);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 7, true);
    
    String [] lines101  = new String[1];
    lines101[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 8, lines101);
    
    String [] lines102  = new String[1];
    lines102[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 8, lines102);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 8, false);
    
    String [] lines103  = new String[1];
    lines103[0] = "";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 9, lines103);
    
    String [] lines104  = new String[1];
    lines104[0] = " - ";
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 9, lines104);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 9, false);
    
    pmiRadialDimensionBuilder2.style().holeCalloutSettings().setThroughHoleTextOfType(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, "THRU");
    
    pmiRadialDimensionBuilder2.style().displayStyle().setEnableBackground(false);
    
    pmiRadialDimensionBuilder2.style().displayStyle().setBackgroundColor(50);
    
    pmiRadialDimensionBuilder2.setHoleStyle(true);
    
    theSession.setUndoMarkName(markId3, "Radial Dimension Dialog");
    
    pmiRadialDimensionBuilder2.origin().plane().setPlaneMethod(nxopen.annotations.PlaneBuilder.PlaneMethodType.MODEL_VIEW);
    
    pmiRadialDimensionBuilder2.origin().setInferRelativeToGeometry(true);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits31;
    dimensionlinearunits31 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits32;
    dimensionlinearunits32 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits33;
    dimensionlinearunits33 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits34;
    dimensionlinearunits34 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits35;
    dimensionlinearunits35 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits36;
    dimensionlinearunits36 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits37;
    dimensionlinearunits37 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits38;
    dimensionlinearunits38 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits39;
    dimensionlinearunits39 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits40;
    dimensionlinearunits40 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    pmiRadialDimensionBuilder2.origin().setInferRelativeToGeometry(true);
    
    pmiRadialDimensionBuilder2.origin().setInferRelativeToGeometry(true);
    
    pmiRadialDimensionBuilder2.measurement().setDirection(nullNXOpen_Direction);
    
    pmiRadialDimensionBuilder2.measurement().setDirectionView(nullNXOpen_View);
    
    pmiRadialDimensionBuilder2.style().dimensionStyle().setNarrowDisplayType(nxopen.annotations.NarrowDisplayOption.NONE);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits41;
    dimensionlinearunits41 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits42;
    dimensionlinearunits42 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits43;
    dimensionlinearunits43 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits44;
    dimensionlinearunits44 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits45;
    dimensionlinearunits45 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits46;
    dimensionlinearunits46 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits47;
    dimensionlinearunits47 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits48;
    dimensionlinearunits48 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits49;
    dimensionlinearunits49 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits50;
    dimensionlinearunits50 = pmiRadialDimensionBuilder2.style().unitsStyle().dimensionLinearUnits();
    
    pmiRadialDimensionBuilder2.destroy();
    
    theSession.undoToMark(markId3, null);
    
    theSession.deleteUndoMark(markId3, null);
    
    theSession.cleanUpFacetedFacesAndEdges();
    
    // ----------------------------------------------
    //   Menu: Edit->Delete...
    // ----------------------------------------------
    int markId4;
    markId4 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Delete");
    
    theSession.updateManager().clearErrorList();
    
    int markId5;
    markId5 = theSession.setUndoMark(nxopen.Session.MarkVisibility.VISIBLE, "Delete");
    
    nxopen.TaggedObject [] objects2  = new nxopen.TaggedObject[1];
    nxopen.annotations.PmiHoleDimension pmiHoleDimension1 = ((nxopen.annotations.PmiHoleDimension)nXObject1);
    objects2[0] = pmiHoleDimension1;
    int nErrs1;
    nErrs1 = theSession.updateManager().addObjectsToDeleteList(objects2);
    
    int id1;
    id1 = theSession.newestVisibleUndoMark();
    
    int nErrs2;
    nErrs2 = theSession.updateManager().doUpdate(id1);
    
    theSession.deleteUndoMark(markId4, null);
    
    // ----------------------------------------------
    //   Menu: PMI->Dimension->Radial...
    // ----------------------------------------------
    int markId6;
    markId6 = theSession.setUndoMark(nxopen.Session.MarkVisibility.VISIBLE, "Start");
    
    nxopen.annotations.PmiRadialDimensionBuilder pmiRadialDimensionBuilder3;
    pmiRadialDimensionBuilder3 = workPart.dimensions().createPmiRadialDimensionBuilder(nullNXOpen_Annotations_Dimension);
    
    String [] lines105  = new String[0];
    pmiRadialDimensionBuilder3.appendedText().setBefore(lines105);
    
    String [] lines106  = new String[0];
    pmiRadialDimensionBuilder3.appendedText().setAfter(lines106);
    
    String [] lines107  = new String[0];
    pmiRadialDimensionBuilder3.appendedText().setAbove(lines107);
    
    String [] lines108  = new String[0];
    pmiRadialDimensionBuilder3.appendedText().setBelow(lines108);
    
    pmiRadialDimensionBuilder3.origin().setInferRelativeToGeometry(true);
    
    pmiRadialDimensionBuilder3.origin().setAnchor(nxopen.annotations.OriginBuilder.AlignmentPosition.MID_CENTER);
    
    pmiRadialDimensionBuilder3.measurement().setMethod(nxopen.annotations.DimensionMeasurementBuilder.MeasurementMethod.HOLE_CALLOUT);
    
    pmiRadialDimensionBuilder3.setHoleStyle(true);
    
    String [] lines109  = new String[0];
    pmiRadialDimensionBuilder3.appendedText().setBefore(lines109);
    
    String [] lines110  = new String[0];
    pmiRadialDimensionBuilder3.appendedText().setAfter(lines110);
    
    String [] lines111  = new String[0];
    pmiRadialDimensionBuilder3.appendedText().setAbove(lines111);
    
    String [] lines112  = new String[0];
    pmiRadialDimensionBuilder3.appendedText().setBelow(lines112);
    
    theSession.setUndoMarkName(markId6, "Radial Dimension Dialog");
    
    pmiRadialDimensionBuilder3.origin().plane().setPlaneMethod(nxopen.annotations.PlaneBuilder.PlaneMethodType.MODEL_VIEW);
    
    pmiRadialDimensionBuilder3.origin().setInferRelativeToGeometry(true);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits51;
    dimensionlinearunits51 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits52;
    dimensionlinearunits52 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits53;
    dimensionlinearunits53 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits54;
    dimensionlinearunits54 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits55;
    dimensionlinearunits55 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits56;
    dimensionlinearunits56 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits57;
    dimensionlinearunits57 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits58;
    dimensionlinearunits58 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits59;
    dimensionlinearunits59 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits60;
    dimensionlinearunits60 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    pmiRadialDimensionBuilder3.origin().setInferRelativeToGeometry(true);
    
    pmiRadialDimensionBuilder3.origin().setInferRelativeToGeometry(true);
    
    pmiRadialDimensionBuilder3.measurement().setDirection(nullNXOpen_Direction);
    
    pmiRadialDimensionBuilder3.measurement().setDirectionView(nullNXOpen_View);
    
    pmiRadialDimensionBuilder3.style().dimensionStyle().setNarrowDisplayType(nxopen.annotations.NarrowDisplayOption.NONE);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits61;
    dimensionlinearunits61 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits62;
    dimensionlinearunits62 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits63;
    dimensionlinearunits63 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits64;
    dimensionlinearunits64 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits65;
    dimensionlinearunits65 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits66;
    dimensionlinearunits66 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits67;
    dimensionlinearunits67 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits68;
    dimensionlinearunits68 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits69;
    dimensionlinearunits69 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits70;
    dimensionlinearunits70 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    int markId7;
    markId7 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Start");
    
    theSession.setUndoMarkName(markId7, "Radial Dimension Settings Dialog");
    
    theSession.setUndoMarkVisibility(markId7, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    // ----------------------------------------------
    //   Dialog Begin Radial Dimension Settings
    // ----------------------------------------------
    int markId8;
    markId8 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    theSession.setUndoMarkName(markId8, "Radial Dimension Settings - Explorer");
    
    theSession.setUndoMarkVisibility(markId8, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId7, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId9;
    markId9 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    // ----------------------------------------------
    //   Dialog Begin Radial Dimension Settings
    // ----------------------------------------------
    theSession.deleteUndoMark(markId9, null);
    
    int markId10;
    markId10 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    theSession.deleteUndoMark(markId10, null);
    
    int markId11;
    markId11 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    theSession.setUndoMarkName(markId11, "Radial Dimension Settings - Type");
    
    theSession.setUndoMarkVisibility(markId11, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId7, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId12;
    markId12 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    pmiRadialDimensionBuilder3.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 6, true);
    
    theSession.setUndoMarkName(markId12, "Radial Dimension Settings - Hole Callout");
    
    theSession.setUndoMarkVisibility(markId12, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId7, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId13;
    markId13 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    theSession.setUndoMarkName(markId13, "Radial Dimension Settings - Explorer");
    
    theSession.setUndoMarkVisibility(markId13, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId7, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId14;
    markId14 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    // ----------------------------------------------
    //   Dialog Begin Radial Dimension Settings
    // ----------------------------------------------
    theSession.deleteUndoMark(markId14, null);
    
    int markId15;
    markId15 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    theSession.setUndoMarkName(markId15, "Radial Dimension Settings - Explorer");
    
    theSession.setUndoMarkVisibility(markId15, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId7, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId16;
    markId16 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    // ----------------------------------------------
    //   Dialog Begin Radial Dimension Settings
    // ----------------------------------------------
    theSession.deleteUndoMark(markId16, null);
    
    int markId17;
    markId17 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    theSession.deleteUndoMark(markId17, null);
    
    int markId18;
    markId18 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    theSession.setUndoMarkName(markId18, "Radial Dimension Settings - Feature");
    
    theSession.setUndoMarkVisibility(markId18, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId7, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId19;
    markId19 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    theSession.deleteUndoMark(markId19, null);
    
    int markId20;
    markId20 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    theSession.deleteUndoMark(markId20, null);
    
    int markId21;
    markId21 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    theSession.setUndoMarkName(markId21, "Radial Dimension Settings - Explorer");
    
    theSession.setUndoMarkVisibility(markId21, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId7, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId22;
    markId22 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    // ----------------------------------------------
    //   Dialog Begin Radial Dimension Settings
    // ----------------------------------------------
    theSession.deleteUndoMark(markId22, null);
    
    int markId23;
    markId23 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    theSession.setUndoMarkName(markId23, "Radial Dimension Settings - Explorer");
    
    theSession.setUndoMarkVisibility(markId23, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId7, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId24;
    markId24 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    // ----------------------------------------------
    //   Dialog Begin Radial Dimension Settings
    // ----------------------------------------------
    theSession.deleteUndoMark(markId24, null);
    
    int markId25;
    markId25 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    theSession.deleteUndoMark(markId25, null);
    
    int markId26;
    markId26 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    pmiRadialDimensionBuilder3.style().letteringStyle().setAppendedTextSize(2.5);
    
    theSession.setUndoMarkName(markId26, "Radial Dimension Settings - Height");
    
    theSession.setUndoMarkVisibility(markId26, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId7, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId27;
    markId27 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    theSession.setUndoMarkName(markId27, "Radial Dimension Settings - Explorer");
    
    theSession.setUndoMarkVisibility(markId27, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId7, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId28;
    markId28 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    // ----------------------------------------------
    //   Dialog Begin Radial Dimension Settings
    // ----------------------------------------------
    theSession.deleteUndoMark(markId28, null);
    
    int markId29;
    markId29 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    int markId30;
    markId30 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension Settings");
    
    theSession.deleteUndoMark(markId30, null);
    
    theSession.setUndoMarkName(markId7, "Radial Dimension Settings");
    
    theSession.deleteUndoMark(markId29, null);
    
    theSession.setUndoMarkVisibility(markId7, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.deleteUndoMark(markId27, null);
    
    theSession.deleteUndoMark(markId26, null);
    
    theSession.deleteUndoMark(markId23, null);
    
    theSession.deleteUndoMark(markId21, null);
    
    theSession.deleteUndoMark(markId18, null);
    
    theSession.deleteUndoMark(markId15, null);
    
    theSession.deleteUndoMark(markId13, null);
    
    theSession.deleteUndoMark(markId12, null);
    
    theSession.deleteUndoMark(markId11, null);
    
    theSession.deleteUndoMark(markId8, null);
    
    theSession.deleteUndoMark(markId7, null);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits71;
    dimensionlinearunits71 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits72;
    dimensionlinearunits72 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits73;
    dimensionlinearunits73 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits74;
    dimensionlinearunits74 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits75;
    dimensionlinearunits75 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits76;
    dimensionlinearunits76 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits77;
    dimensionlinearunits77 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits78;
    dimensionlinearunits78 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits79;
    dimensionlinearunits79 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits80;
    dimensionlinearunits80 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits81;
    dimensionlinearunits81 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits82;
    dimensionlinearunits82 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits83;
    dimensionlinearunits83 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits84;
    dimensionlinearunits84 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits85;
    dimensionlinearunits85 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits86;
    dimensionlinearunits86 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits87;
    dimensionlinearunits87 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits88;
    dimensionlinearunits88 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits89;
    dimensionlinearunits89 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.Point3d point3 = new nxopen.Point3d(158.72339003223939, 17.719786586335509, -2.2000732297446666);
    pmiRadialDimensionBuilder3.firstAssociativity().setValue(holePackage1, workPart.modelingViews().workView(), point3);
    
    pmiRadialDimensionBuilder3.measurement().setPartOccurrence(nullNXOpen_Assemblies_Component);
    
    nxopen.Point3d pickpoint2 = new nxopen.Point3d(158.72339003223939, 17.719786586335509, -2.2000732297446666);
    pmiRadialDimensionBuilder3.style().holeCalloutSettings().resetFromFeature(bodyFeature1, nullNXOpen_Assemblies_Component, workPart.modelingViews().workView(), pickpoint2);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits90;
    dimensionlinearunits90 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits91;
    dimensionlinearunits91 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    pmiRadialDimensionBuilder3.measurement().setPartOccurrence(nullNXOpen_Assemblies_Component);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits92;
    dimensionlinearunits92 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits93;
    dimensionlinearunits93 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits94;
    dimensionlinearunits94 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits95;
    dimensionlinearunits95 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits96;
    dimensionlinearunits96 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits97;
    dimensionlinearunits97 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.NXObject [] objects3  = new nxopen.NXObject[1];
    objects3[0] = bodyFeature1;
    pmiRadialDimensionBuilder3.associatedObjects().nxobjects().setArray(objects3);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits98;
    dimensionlinearunits98 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits99;
    dimensionlinearunits99 = pmiRadialDimensionBuilder3.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.Point3d origin3 = new nxopen.Point3d(155.26637437220575, -56.561139183779652, -138.44774177881931);
    workPart.modelingViews().workView().setOrigin(origin3);
    
    nxopen.Point3d origin4 = new nxopen.Point3d(155.26637437220575, -56.561139183779652, -138.44774177881931);
    workPart.modelingViews().workView().setOrigin(origin4);
    
    nxopen.annotations.Annotation.AssociativeOriginData assocOrigin2 = new nxopen.annotations.Annotation.AssociativeOriginData();
    assocOrigin2.originType = nxopen.annotations.AssociativeOriginType.DRAG;
    assocOrigin2.view = nullNXOpen_View;
    assocOrigin2.viewOfGeometry = nullNXOpen_View;
    assocOrigin2.pointOnGeometry = nullNXOpen_Point;
    assocOrigin2.vertAnnotation = nullNXOpen_Annotations_Annotation;
    assocOrigin2.vertAlignmentPosition = nxopen.annotations.AlignmentPosition.TOP_LEFT;
    assocOrigin2.horizAnnotation = nullNXOpen_Annotations_Annotation;
    assocOrigin2.horizAlignmentPosition = nxopen.annotations.AlignmentPosition.TOP_LEFT;
    assocOrigin2.alignedAnnotation = nullNXOpen_Annotations_Annotation;
    assocOrigin2.dimensionLine = 0;
    assocOrigin2.associatedView = nullNXOpen_View;
    assocOrigin2.associatedPoint = nullNXOpen_Point;
    assocOrigin2.offsetAnnotation = nullNXOpen_Annotations_Annotation;
    assocOrigin2.offsetAlignmentPosition = nxopen.annotations.AlignmentPosition.TOP_LEFT;
    assocOrigin2.xOffsetFactor = 0.0;
    assocOrigin2.yOffsetFactor = 0.0;
    assocOrigin2.stackAlignmentPosition = nxopen.annotations.StackAlignmentPosition.ABOVE;
    pmiRadialDimensionBuilder3.origin().setAssociativeOrigin(assocOrigin2);
    
    nxopen.Point3d point4 = new nxopen.Point3d(197.21649821503024, -23.337805668170923, -0.5);
    pmiRadialDimensionBuilder3.origin().origin().setValue(null, nullNXOpen_View, point4);
    
    pmiRadialDimensionBuilder3.origin().setInferRelativeToGeometry(true);
    
    pmiRadialDimensionBuilder3.style().lineArrowStyle().setLeaderOrientation(nxopen.annotations.LeaderSide.RIGHT);
    
    pmiRadialDimensionBuilder3.style().dimensionStyle().setTextCentered(false);
    
    String [] lines113  = new String[1];
    lines113[0] = "2 X";
    pmiRadialDimensionBuilder3.appendedText().setBefore(lines113);
    
    pmiRadialDimensionBuilder3.style().lineArrowStyle().setLeaderOrientation(nxopen.annotations.LeaderSide.RIGHT);
    
    pmiRadialDimensionBuilder3.style().dimensionStyle().setTextCentered(false);
    
    String [] lines114  = new String[1];
    lines114[0] = "2 X";
    pmiRadialDimensionBuilder3.appendedText().setBefore(lines114);
    
    int markId31;
    markId31 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension");
    
    nxopen.NXObject nXObject2;
    nXObject2 = pmiRadialDimensionBuilder3.commit();
    
    theSession.deleteUndoMark(markId31, null);
    
    theSession.setUndoMarkName(markId6, "Radial Dimension");
    
    theSession.setUndoMarkVisibility(markId6, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    pmiRadialDimensionBuilder3.destroy();
    
    int markId32;
    markId32 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Start");
    
    nxopen.annotations.PmiRadialDimensionBuilder pmiRadialDimensionBuilder4;
    pmiRadialDimensionBuilder4 = workPart.dimensions().createPmiRadialDimensionBuilder(nullNXOpen_Annotations_Dimension);
    
    String [] lines115  = new String[1];
    lines115[0] = "2 X";
    pmiRadialDimensionBuilder4.appendedText().setBefore(lines115);
    
    String [] lines116  = new String[0];
    pmiRadialDimensionBuilder4.appendedText().setAfter(lines116);
    
    String [] lines117  = new String[0];
    pmiRadialDimensionBuilder4.appendedText().setAbove(lines117);
    
    String [] lines118  = new String[0];
    pmiRadialDimensionBuilder4.appendedText().setBelow(lines118);
    
    pmiRadialDimensionBuilder4.origin().setInferRelativeToGeometry(true);
    
    pmiRadialDimensionBuilder4.origin().setAnchor(nxopen.annotations.OriginBuilder.AlignmentPosition.MID_CENTER);
    
    pmiRadialDimensionBuilder4.measurement().setMethod(nxopen.annotations.DimensionMeasurementBuilder.MeasurementMethod.HOLE_CALLOUT);
    
    pmiRadialDimensionBuilder4.style().dimensionStyle().setLimitFitDeviation("H");
    
    pmiRadialDimensionBuilder4.style().dimensionStyle().setLimitFitShaftDeviation("g");
    
    pmiRadialDimensionBuilder4.style().letteringStyle().setAppendedTextSize(2.5);
    
    nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype [] parameters6  = new nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype[9];
    parameters6[0] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.PATTERN_FEATURE_COUNT;
    parameters6[1] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.DIAMETER;
    parameters6[2] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.DEPTH;
    parameters6[3] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.LINE_BREAK;
    parameters6[4] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.COUNTER_BORE_DIAMETER;
    parameters6[5] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.COUNTER_BORE_DEPTH;
    parameters6[6] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.COUNTER_SINK_DIAMETER;
    parameters6[7] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.COUNTER_SINK_ANGLE;
    parameters6[8] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.TAPER_ANGLE;
    boolean orderischanged6;
    orderischanged6 = pmiRadialDimensionBuilder4.style().holeCalloutSettings().reorderParameters(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, parameters6);
    
    String [] lines119  = new String[1];
    lines119[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 0, lines119);
    
    String [] lines120  = new String[1];
    lines120[0] = " X";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 0, lines120);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 0, true);
    
    String [] lines121  = new String[1];
    lines121[0] = "<o> ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 1, lines121);
    
    String [] lines122  = new String[1];
    lines122[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 1, lines122);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 1, true);
    
    String [] lines123  = new String[1];
    lines123[0] = "<#D> ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 2, lines123);
    
    String [] lines124  = new String[1];
    lines124[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 2, lines124);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 2, true);
    
    String [] lines125  = new String[1];
    lines125[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 3, lines125);
    
    String [] lines126  = new String[1];
    lines126[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 3, lines126);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 3, false);
    
    String [] lines127  = new String[1];
    lines127[0] = "<#B><o> ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 4, lines127);
    
    String [] lines128  = new String[1];
    lines128[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 4, lines128);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 4, true);
    
    String [] lines129  = new String[1];
    lines129[0] = "<#D> ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 5, lines129);
    
    String [] lines130  = new String[1];
    lines130[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 5, lines130);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 5, true);
    
    String [] lines131  = new String[1];
    lines131[0] = "<#C><o> ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 6, lines131);
    
    String [] lines132  = new String[1];
    lines132[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 6, lines132);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 6, true);
    
    String [] lines133  = new String[1];
    lines133[0] = " X ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 7, lines133);
    
    String [] lines134  = new String[1];
    lines134[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 7, lines134);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 7, true);
    
    String [] lines135  = new String[1];
    lines135[0] = "<#E> ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 8, lines135);
    
    String [] lines136  = new String[1];
    lines136[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 8, lines136);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, 8, true);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setThroughHoleTextOfType(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.GENERAL_HOLE, "THRU");
    
    nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype [] parameters7  = new nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype[12];
    parameters7[0] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.PATTERN_FEATURE_COUNT;
    parameters7[1] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.THREAD_SIZE;
    parameters7[2] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.THREAD_PITCH;
    parameters7[3] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.THREAD_DEPTH;
    parameters7[4] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.THREAD_FORM;
    parameters7[5] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.THREAD_INTERNAL_EXTERNAL_SYMBOL;
    parameters7[6] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.DEPTH;
    parameters7[7] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.PITCH;
    parameters7[8] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.ANGLE;
    parameters7[9] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.MINOR_DIAMETER;
    parameters7[10] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.MAJOR_DIAMETER;
    parameters7[11] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.TAP_DRILL_DIAMETER;
    boolean orderischanged7;
    orderischanged7 = pmiRadialDimensionBuilder4.style().holeCalloutSettings().reorderParameters(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, parameters7);
    
    String [] lines137  = new String[1];
    lines137[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 0, lines137);
    
    String [] lines138  = new String[1];
    lines138[0] = " X";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 0, lines138);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 0, true);
    
    String [] lines139  = new String[1];
    lines139[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 1, lines139);
    
    String [] lines140  = new String[1];
    lines140[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 1, lines140);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 1, true);
    
    String [] lines141  = new String[1];
    lines141[0] = "x";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 2, lines141);
    
    String [] lines142  = new String[1];
    lines142[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 2, lines142);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 2, true);
    
    String [] lines143  = new String[1];
    lines143[0] = "<#D> ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 3, lines143);
    
    String [] lines144  = new String[1];
    lines144[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 3, lines144);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 3, true);
    
    String [] lines145  = new String[1];
    lines145[0] = " ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 4, lines145);
    
    String [] lines146  = new String[1];
    lines146[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 4, lines146);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 4, false);
    
    String [] lines147  = new String[1];
    lines147[0] = "-2";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 5, lines147);
    
    String [] lines148  = new String[1];
    lines148[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 5, lines148);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 5, false);
    
    String [] lines149  = new String[1];
    lines149[0] = "<#D> ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 6, lines149);
    
    String [] lines150  = new String[1];
    lines150[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 6, lines150);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 6, true);
    
    String [] lines151  = new String[1];
    lines151[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 7, lines151);
    
    String [] lines152  = new String[1];
    lines152[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 7, lines152);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 7, false);
    
    String [] lines153  = new String[1];
    lines153[0] = " X ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 8, lines153);
    
    String [] lines154  = new String[1];
    lines154[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 8, lines154);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 8, false);
    
    String [] lines155  = new String[1];
    lines155[0] = "Minor:<o> ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 9, lines155);
    
    String [] lines156  = new String[1];
    lines156[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 9, lines156);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 9, false);
    
    String [] lines157  = new String[1];
    lines157[0] = "Major:<o> ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 10, lines157);
    
    String [] lines158  = new String[1];
    lines158[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 10, lines158);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 10, false);
    
    String [] lines159  = new String[1];
    lines159[0] = "Tap Drill:<o> ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 11, lines159);
    
    String [] lines160  = new String[1];
    lines160[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 11, lines160);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 11, false);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setThroughHoleTextOfType(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, "THRU");
    
    nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype [] parameters8  = new nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype[3];
    parameters8[0] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.PATTERN_FEATURE_COUNT;
    parameters8[1] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.DIAMETER;
    parameters8[2] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.DEPTH;
    boolean orderischanged8;
    orderischanged8 = pmiRadialDimensionBuilder4.style().holeCalloutSettings().reorderParameters(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, parameters8);
    
    String [] lines161  = new String[1];
    lines161[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, 0, lines161);
    
    String [] lines162  = new String[1];
    lines162[0] = " X";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, 0, lines162);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, 0, true);
    
    String [] lines163  = new String[1];
    lines163[0] = "<o> ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, 1, lines163);
    
    String [] lines164  = new String[1];
    lines164[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, 1, lines164);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, 1, true);
    
    String [] lines165  = new String[1];
    lines165[0] = "<#D> ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, 2, lines165);
    
    String [] lines166  = new String[1];
    lines166[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, 2, lines166);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, 2, true);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setThroughHoleTextOfType(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.DRILL_SIZE_HOLE, "THRU");
    
    nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype [] parameters9  = new nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype[12];
    parameters9[0] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.PATTERN_FEATURE_COUNT;
    parameters9[1] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.CALLOUT;
    parameters9[2] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.SYMBOLIC_THREAD_PITCH;
    parameters9[3] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.SYMBOLIC_THREAD_FORM;
    parameters9[4] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.SYMBOLIC_THREAD_INTERNAL_EXTERNAL_SYMBOL;
    parameters9[5] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.LENGTH;
    parameters9[6] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.PITCH;
    parameters9[7] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.ANGLE;
    parameters9[8] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.MINOR_DIAMETER;
    parameters9[9] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.MAJOR_DIAMETER;
    parameters9[10] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.TAP_DRILL_DIAMETER;
    parameters9[11] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.SHAFT_SIZE;
    boolean orderischanged9;
    orderischanged9 = pmiRadialDimensionBuilder4.style().holeCalloutSettings().reorderParameters(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, parameters9);
    
    String [] lines167  = new String[1];
    lines167[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 0, lines167);
    
    String [] lines168  = new String[1];
    lines168[0] = " X";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 0, lines168);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 0, false);
    
    String [] lines169  = new String[1];
    lines169[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 1, lines169);
    
    String [] lines170  = new String[1];
    lines170[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 1, lines170);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 1, true);
    
    String [] lines171  = new String[1];
    lines171[0] = "x";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 2, lines171);
    
    String [] lines172  = new String[1];
    lines172[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 2, lines172);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 2, true);
    
    String [] lines173  = new String[1];
    lines173[0] = " ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 3, lines173);
    
    String [] lines174  = new String[1];
    lines174[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 3, lines174);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 3, false);
    
    String [] lines175  = new String[1];
    lines175[0] = "-2";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 4, lines175);
    
    String [] lines176  = new String[1];
    lines176[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 4, lines176);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 4, false);
    
    String [] lines177  = new String[1];
    lines177[0] = "<#D> ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 5, lines177);
    
    String [] lines178  = new String[1];
    lines178[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 5, lines178);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 5, false);
    
    String [] lines179  = new String[1];
    lines179[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 6, lines179);
    
    String [] lines180  = new String[1];
    lines180[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 6, lines180);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 6, false);
    
    String [] lines181  = new String[1];
    lines181[0] = " X ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 7, lines181);
    
    String [] lines182  = new String[1];
    lines182[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 7, lines182);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 7, false);
    
    String [] lines183  = new String[1];
    lines183[0] = "Minor:<o> ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 8, lines183);
    
    String [] lines184  = new String[1];
    lines184[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 8, lines184);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 8, false);
    
    String [] lines185  = new String[1];
    lines185[0] = "Major:<o> ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 9, lines185);
    
    String [] lines186  = new String[1];
    lines186[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 9, lines186);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 9, false);
    
    String [] lines187  = new String[1];
    lines187[0] = "Tap Drill:<o> ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 10, lines187);
    
    String [] lines188  = new String[1];
    lines188[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 10, lines188);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 10, false);
    
    String [] lines189  = new String[1];
    lines189[0] = "Shaft Size:<o> ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 11, lines189);
    
    String [] lines190  = new String[1];
    lines190[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 11, lines190);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, 11, false);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setThroughHoleTextOfType(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SYMBOLIC_THREAD, "");
    
    nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype [] parameters10  = new nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype[10];
    parameters10[0] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.PATTERN_FEATURE_COUNT;
    parameters10[1] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.DIAMETER;
    parameters10[2] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.DEPTH;
    parameters10[3] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.LINE_BREAK;
    parameters10[4] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.COUNTER_BORE_DIAMETER;
    parameters10[5] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.COUNTER_BORE_DEPTH;
    parameters10[6] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.COUNTER_SINK_DIAMETER;
    parameters10[7] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.COUNTER_SINK_ANGLE;
    parameters10[8] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.FIT;
    parameters10[9] = nxopen.annotations.HoleCalloutSettingsBuilder.Parametertype.SCREW_SIZE;
    boolean orderischanged10;
    orderischanged10 = pmiRadialDimensionBuilder4.style().holeCalloutSettings().reorderParameters(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, parameters10);
    
    String [] lines191  = new String[1];
    lines191[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 0, lines191);
    
    String [] lines192  = new String[1];
    lines192[0] = "X";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 0, lines192);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 0, true);
    
    String [] lines193  = new String[1];
    lines193[0] = "<o> ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 1, lines193);
    
    String [] lines194  = new String[1];
    lines194[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 1, lines194);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 1, true);
    
    String [] lines195  = new String[1];
    lines195[0] = "<#D>";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 2, lines195);
    
    String [] lines196  = new String[1];
    lines196[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 2, lines196);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 2, true);
    
    String [] lines197  = new String[1];
    lines197[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 3, lines197);
    
    String [] lines198  = new String[1];
    lines198[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 3, lines198);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 3, false);
    
    String [] lines199  = new String[1];
    lines199[0] = "<#B><o>";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 4, lines199);
    
    String [] lines200  = new String[1];
    lines200[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 4, lines200);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 4, true);
    
    String [] lines201  = new String[1];
    lines201[0] = "<#D>";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 5, lines201);
    
    String [] lines202  = new String[1];
    lines202[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 5, lines202);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 5, true);
    
    String [] lines203  = new String[1];
    lines203[0] = "<#C><o>";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 6, lines203);
    
    String [] lines204  = new String[1];
    lines204[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 6, lines204);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 6, true);
    
    String [] lines205  = new String[1];
    lines205[0] = "X";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 7, lines205);
    
    String [] lines206  = new String[1];
    lines206[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 7, lines206);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 7, true);
    
    String [] lines207  = new String[1];
    lines207[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 8, lines207);
    
    String [] lines208  = new String[1];
    lines208[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 8, lines208);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 8, false);
    
    String [] lines209  = new String[1];
    lines209[0] = "";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterPrefix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 9, lines209);
    
    String [] lines210  = new String[1];
    lines210[0] = " - ";
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterSuffix(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 9, lines210);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setNthParameterDisplay(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, 9, false);
    
    pmiRadialDimensionBuilder4.style().holeCalloutSettings().setThroughHoleTextOfType(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.SCREW_CLEARANCE_HOLE, "THRU");
    
    pmiRadialDimensionBuilder4.style().displayStyle().setEnableBackground(false);
    
    pmiRadialDimensionBuilder4.style().displayStyle().setBackgroundColor(50);
    
    pmiRadialDimensionBuilder4.setHoleStyle(true);
    
    String [] lines211  = new String[1];
    lines211[0] = "2 X";
    pmiRadialDimensionBuilder4.appendedText().setBefore(lines211);
    
    theSession.setUndoMarkName(markId32, "Radial Dimension Dialog");
    
    pmiRadialDimensionBuilder4.origin().plane().setPlaneMethod(nxopen.annotations.PlaneBuilder.PlaneMethodType.MODEL_VIEW);
    
    pmiRadialDimensionBuilder4.origin().setInferRelativeToGeometry(true);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits100;
    dimensionlinearunits100 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits101;
    dimensionlinearunits101 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits102;
    dimensionlinearunits102 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits103;
    dimensionlinearunits103 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits104;
    dimensionlinearunits104 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits105;
    dimensionlinearunits105 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits106;
    dimensionlinearunits106 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits107;
    dimensionlinearunits107 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits108;
    dimensionlinearunits108 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits109;
    dimensionlinearunits109 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    pmiRadialDimensionBuilder4.origin().setInferRelativeToGeometry(true);
    
    pmiRadialDimensionBuilder4.origin().setInferRelativeToGeometry(true);
    
    pmiRadialDimensionBuilder4.measurement().setDirection(nullNXOpen_Direction);
    
    pmiRadialDimensionBuilder4.measurement().setDirectionView(nullNXOpen_View);
    
    pmiRadialDimensionBuilder4.style().dimensionStyle().setNarrowDisplayType(nxopen.annotations.NarrowDisplayOption.NONE);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits110;
    dimensionlinearunits110 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits111;
    dimensionlinearunits111 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits112;
    dimensionlinearunits112 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits113;
    dimensionlinearunits113 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits114;
    dimensionlinearunits114 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits115;
    dimensionlinearunits115 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits116;
    dimensionlinearunits116 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits117;
    dimensionlinearunits117 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits118;
    dimensionlinearunits118 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits119;
    dimensionlinearunits119 = pmiRadialDimensionBuilder4.style().unitsStyle().dimensionLinearUnits();
    
    pmiRadialDimensionBuilder4.destroy();
    
    theSession.undoToMark(markId32, null);
    
    theSession.deleteUndoMark(markId32, null);
    
    theSession.cleanUpFacetedFacesAndEdges();
    
    // ----------------------------------------------
    //   Menu: Edit->Settings...
    // ----------------------------------------------
    int markId33;
    markId33 = theSession.setUndoMark(nxopen.Session.MarkVisibility.VISIBLE, "Start");
    
    nxopen.DisplayableObject [] objects4  = new nxopen.DisplayableObject[1];
    nxopen.annotations.PmiHoleDimension pmiHoleDimension2 = ((nxopen.annotations.PmiHoleDimension)nXObject2);
    objects4[0] = pmiHoleDimension2;
    nxopen.annotations.EditSettingsBuilder editSettingsBuilder1;
    editSettingsBuilder1 = workPart.settingsManager().createAnnotationEditSettingsBuilder(objects4);
    
    theSession.setUndoMarkName(markId33, "Settings Dialog");
    
    nxopen.drafting.BaseEditSettingsBuilder [] editsettingsbuilders1  = new nxopen.drafting.BaseEditSettingsBuilder[1];
    editsettingsbuilders1[0] = editSettingsBuilder1;
    workPart.settingsManager().processForMultipleObjectsSettings(editsettingsbuilders1);
    
    int markId34;
    markId34 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Settings");
    
    editSettingsBuilder1.destroy();
    
    theSession.undoToMark(markId33, null);
    
    theSession.deleteUndoMark(markId33, null);
    
    theSession.cleanUpFacetedFacesAndEdges();
    
    int markId35;
    markId35 = theSession.setUndoMark(nxopen.Session.MarkVisibility.VISIBLE, "Start");
    
    nxopen.annotations.PmiRadialDimensionBuilder pmiRadialDimensionBuilder5;
    pmiRadialDimensionBuilder5 = workPart.dimensions().createPmiRadialDimensionBuilder(pmiHoleDimension2);
    
    theSession.setUndoMarkName(markId35, "Radial Dimension Dialog");
    
    pmiRadialDimensionBuilder5.origin().setInferRelativeToGeometry(true);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits120;
    dimensionlinearunits120 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits121;
    dimensionlinearunits121 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    pmiRadialDimensionBuilder5.style().ordinateStyle().setDoglegCreationOption(nxopen.annotations.OrdinateDoglegCreationOption.NO);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits122;
    dimensionlinearunits122 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits123;
    dimensionlinearunits123 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits124;
    dimensionlinearunits124 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits125;
    dimensionlinearunits125 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    pmiRadialDimensionBuilder5.origin().setInferRelativeToGeometry(true);
    
    pmiRadialDimensionBuilder5.origin().setInferRelativeToGeometry(true);
    
    pmiRadialDimensionBuilder5.measurement().setDirection(nullNXOpen_Direction);
    
    pmiRadialDimensionBuilder5.measurement().setDirectionView(nullNXOpen_View);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits126;
    dimensionlinearunits126 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits127;
    dimensionlinearunits127 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits128;
    dimensionlinearunits128 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits129;
    dimensionlinearunits129 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits130;
    dimensionlinearunits130 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits131;
    dimensionlinearunits131 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    // ----------------------------------------------
    //   Dialog Begin Radial Dimension
    // ----------------------------------------------
    int markId36;
    markId36 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension");
    
    theSession.deleteUndoMark(markId36, null);
    
    int markId37;
    markId37 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension");
    
    theSession.deleteUndoMark(markId37, null);
    
    int markId38;
    markId38 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension");
    
    int markId39;
    markId39 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Start");
    
    theSession.setUndoMarkName(markId39, "Text Settings Dialog");
    
    theSession.setUndoMarkVisibility(markId39, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    // ----------------------------------------------
    //   Dialog Begin Text Settings
    // ----------------------------------------------
    int markId40;
    markId40 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Text Settings");
    
    theSession.setUndoMarkName(markId40, "Text Settings - Explorer");
    
    theSession.setUndoMarkVisibility(markId40, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId39, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId41;
    markId41 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Text Settings");
    
    // ----------------------------------------------
    //   Dialog Begin Text Settings
    // ----------------------------------------------
    theSession.deleteUndoMark(markId41, null);
    
    int markId42;
    markId42 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Text Settings");
    
    theSession.setUndoMarkName(markId42, "Text Settings - Explorer");
    
    theSession.setUndoMarkVisibility(markId42, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId39, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId43;
    markId43 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Text Settings");
    
    // ----------------------------------------------
    //   Dialog Begin Text Settings
    // ----------------------------------------------
    theSession.deleteUndoMark(markId43, null);
    
    int markId44;
    markId44 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Text Settings");
    
    theSession.setUndoMarkName(markId44, "Text Settings - Explorer");
    
    theSession.setUndoMarkVisibility(markId44, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId39, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId45;
    markId45 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Text Settings");
    
    // ----------------------------------------------
    //   Dialog Begin Text Settings
    // ----------------------------------------------
    theSession.deleteUndoMark(markId45, null);
    
    int markId46;
    markId46 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Text Settings");
    
    theSession.setUndoMarkName(markId46, "Text Settings - Explorer");
    
    theSession.setUndoMarkVisibility(markId46, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId39, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId47;
    markId47 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Text Settings");
    
    // ----------------------------------------------
    //   Dialog Begin Text Settings
    // ----------------------------------------------
    theSession.deleteUndoMark(markId47, null);
    
    int markId48;
    markId48 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Text Settings");
    
    theSession.setUndoMarkName(markId48, "Text Settings - Explorer");
    
    theSession.setUndoMarkVisibility(markId48, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId39, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId49;
    markId49 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Text Settings");
    
    // ----------------------------------------------
    //   Dialog Begin Text Settings
    // ----------------------------------------------
    theSession.deleteUndoMark(markId49, null);
    
    int markId50;
    markId50 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Text Settings");
    
    theSession.setUndoMarkName(markId50, "Text Settings - Explorer");
    
    theSession.setUndoMarkVisibility(markId50, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId39, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId51;
    markId51 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Text Settings");
    
    // ----------------------------------------------
    //   Dialog Begin Text Settings
    // ----------------------------------------------
    theSession.deleteUndoMark(markId51, null);
    
    int markId52;
    markId52 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Text Settings");
    
    theSession.setUndoMarkName(markId52, "Text Settings - Explorer");
    
    theSession.setUndoMarkVisibility(markId52, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId39, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId53;
    markId53 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Text Settings");
    
    // ----------------------------------------------
    //   Dialog Begin Text Settings
    // ----------------------------------------------
    theSession.deleteUndoMark(markId53, null);
    
    int markId54;
    markId54 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Text Settings");
    
    int markId55;
    markId55 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Text Settings");
    
    theSession.deleteUndoMark(markId55, null);
    
    theSession.setUndoMarkName(markId39, "Text Settings");
    
    theSession.deleteUndoMark(markId54, null);
    
    theSession.setUndoMarkVisibility(markId39, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.deleteUndoMark(markId52, null);
    
    theSession.deleteUndoMark(markId50, null);
    
    theSession.deleteUndoMark(markId48, null);
    
    theSession.deleteUndoMark(markId46, null);
    
    theSession.deleteUndoMark(markId44, null);
    
    theSession.deleteUndoMark(markId42, null);
    
    theSession.deleteUndoMark(markId40, null);
    
    theSession.deleteUndoMark(markId39, null);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits132;
    dimensionlinearunits132 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits133;
    dimensionlinearunits133 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits134;
    dimensionlinearunits134 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits135;
    dimensionlinearunits135 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits136;
    dimensionlinearunits136 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits137;
    dimensionlinearunits137 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits138;
    dimensionlinearunits138 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits139;
    dimensionlinearunits139 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits140;
    dimensionlinearunits140 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits141;
    dimensionlinearunits141 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits142;
    dimensionlinearunits142 = pmiRadialDimensionBuilder5.style().unitsStyle().dimensionLinearUnits();
    
    theSession.setUndoMarkName(markId38, "Radial Dimension - StyleBuilder");
    
    theSession.setUndoMarkVisibility(markId38, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId35, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId56;
    markId56 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension");
    
    theSession.deleteUndoMark(markId56, null);
    
    int markId57;
    markId57 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension");
    
    nxopen.annotations.StyleBuilder styleBuilder1;
    styleBuilder1 = pmiRadialDimensionBuilder5.style().holeCalloutSettings().getNthParameterStyle(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 2);
    
    nxopen.annotations.DimensionStyleBuilder dimensionStyleBuilder1;
    dimensionStyleBuilder1 = styleBuilder1.dimensionStyle();
    
    nxopen.annotations.UnitsStyleBuilder unitsStyleBuilder1;
    unitsStyleBuilder1 = styleBuilder1.unitsStyle();
    
    nxopen.annotations.RadialStyleBuilder radialStyleBuilder1;
    radialStyleBuilder1 = styleBuilder1.radialStyle();
    
    nxopen.annotations.OrdinateStyleBuilder ordinateStyleBuilder1;
    ordinateStyleBuilder1 = styleBuilder1.ordinateStyle();
    
    nxopen.annotations.LetteringStyleBuilder letteringStyleBuilder1;
    letteringStyleBuilder1 = styleBuilder1.letteringStyle();
    
    nxopen.annotations.LineArrowStyleBuilder lineArrowStyleBuilder1;
    lineArrowStyleBuilder1 = styleBuilder1.lineArrowStyle();
    
    nxopen.annotations.SingleSidedDisplayBuilder singleSidedDisplayBuilder1;
    singleSidedDisplayBuilder1 = styleBuilder1.singleSidedDisplay();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits143;
    dimensionlinearunits143 = unitsStyleBuilder1.dimensionLinearUnits();
    
    ordinateStyleBuilder1.setDoglegCreationOption(nxopen.annotations.OrdinateDoglegCreationOption.NO);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits144;
    dimensionlinearunits144 = unitsStyleBuilder1.dimensionLinearUnits();
    
    theSession.setUndoMarkName(markId57, "Radial Dimension - Hole Callout Parameter");
    
    theSession.setUndoMarkVisibility(markId57, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId35, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId58;
    markId58 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension");
    
    theSession.deleteUndoMark(markId58, null);
    
    int markId59;
    markId59 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension");
    
    nxopen.annotations.DimensionUnit dimensionlinearunits145;
    dimensionlinearunits145 = unitsStyleBuilder1.dimensionLinearUnits();
    
    dimensionStyleBuilder1.setToleranceType(nxopen.annotations.ToleranceType.BILATERAL_ONE_LINE);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits146;
    dimensionlinearunits146 = unitsStyleBuilder1.dimensionLinearUnits();
    
    theSession.setUndoMarkName(markId59, "Radial Dimension - StyleBuilder");
    
    theSession.setUndoMarkVisibility(markId59, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId35, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId60;
    markId60 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension");
    
    theSession.deleteUndoMark(markId60, null);
    
    int markId61;
    markId61 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension");
    
    nxopen.annotations.DimensionUnit dimensionlinearunits147;
    dimensionlinearunits147 = unitsStyleBuilder1.dimensionLinearUnits();
    
    dimensionStyleBuilder1.setUpperToleranceMetric(0.5);
    
    dimensionStyleBuilder1.setUpperToleranceEnglish(0.01968503937007874);
    
    dimensionStyleBuilder1.setLowerToleranceEnglish(-0.003937007874015748);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits148;
    dimensionlinearunits148 = unitsStyleBuilder1.dimensionLinearUnits();
    
    theSession.setUndoMarkName(markId61, "Radial Dimension - StyleBuilder");
    
    theSession.setUndoMarkVisibility(markId61, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId35, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId62;
    markId62 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension");
    
    theSession.deleteUndoMark(markId62, null);
    
    int markId63;
    markId63 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension");
    
    nxopen.annotations.StyleBuilder styleBuilder2;
    styleBuilder2 = pmiRadialDimensionBuilder5.style().holeCalloutSettings().getNthParameterStyle(nxopen.annotations.HoleCalloutSettingsBuilder.Featuretype.THREADED_HOLE, 4);
    
    nxopen.annotations.DimensionStyleBuilder dimensionStyleBuilder2;
    dimensionStyleBuilder2 = styleBuilder2.dimensionStyle();
    
    nxopen.annotations.UnitsStyleBuilder unitsStyleBuilder2;
    unitsStyleBuilder2 = styleBuilder2.unitsStyle();
    
    nxopen.annotations.RadialStyleBuilder radialStyleBuilder2;
    radialStyleBuilder2 = styleBuilder2.radialStyle();
    
    nxopen.annotations.OrdinateStyleBuilder ordinateStyleBuilder2;
    ordinateStyleBuilder2 = styleBuilder2.ordinateStyle();
    
    nxopen.annotations.LetteringStyleBuilder letteringStyleBuilder2;
    letteringStyleBuilder2 = styleBuilder2.letteringStyle();
    
    nxopen.annotations.LineArrowStyleBuilder lineArrowStyleBuilder2;
    lineArrowStyleBuilder2 = styleBuilder2.lineArrowStyle();
    
    nxopen.annotations.SingleSidedDisplayBuilder singleSidedDisplayBuilder2;
    singleSidedDisplayBuilder2 = styleBuilder2.singleSidedDisplay();
    
    nxopen.annotations.DimensionUnit dimensionlinearunits149;
    dimensionlinearunits149 = unitsStyleBuilder2.dimensionLinearUnits();
    
    ordinateStyleBuilder2.setDoglegCreationOption(nxopen.annotations.OrdinateDoglegCreationOption.NO);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits150;
    dimensionlinearunits150 = unitsStyleBuilder2.dimensionLinearUnits();
    
    theSession.setUndoMarkName(markId63, "Radial Dimension - Hole Callout Parameter");
    
    theSession.setUndoMarkVisibility(markId63, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId35, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId64;
    markId64 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension");
    
    theSession.deleteUndoMark(markId64, null);
    
    int markId65;
    markId65 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension");
    
    nxopen.annotations.DimensionUnit dimensionlinearunits151;
    dimensionlinearunits151 = unitsStyleBuilder2.dimensionLinearUnits();
    
    dimensionStyleBuilder2.setToleranceType(nxopen.annotations.ToleranceType.BILATERAL_ONE_LINE);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits152;
    dimensionlinearunits152 = unitsStyleBuilder2.dimensionLinearUnits();
    
    theSession.setUndoMarkName(markId65, "Radial Dimension - StyleBuilder");
    
    theSession.setUndoMarkVisibility(markId65, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId35, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId66;
    markId66 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension");
    
    theSession.deleteUndoMark(markId66, null);
    
    int markId67;
    markId67 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension");
    
    nxopen.annotations.DimensionUnit dimensionlinearunits153;
    dimensionlinearunits153 = unitsStyleBuilder2.dimensionLinearUnits();
    
    dimensionStyleBuilder2.setUpperToleranceMetric(0.5);
    
    dimensionStyleBuilder2.setUpperToleranceEnglish(0.01968503937007874);
    
    dimensionStyleBuilder2.setLowerToleranceEnglish(-0.003937007874015748);
    
    nxopen.annotations.DimensionUnit dimensionlinearunits154;
    dimensionlinearunits154 = unitsStyleBuilder2.dimensionLinearUnits();
    
    theSession.setUndoMarkName(markId67, "Radial Dimension - StyleBuilder");
    
    theSession.setUndoMarkVisibility(markId67, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.setUndoMarkVisibility(markId35, null, nxopen.Session.MarkVisibility.INVISIBLE);
    
    int markId68;
    markId68 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension");
    
    int markId69;
    markId69 = theSession.setUndoMark(nxopen.Session.MarkVisibility.INVISIBLE, "Radial Dimension");
    
    nxopen.NXObject nXObject3;
    nXObject3 = pmiRadialDimensionBuilder5.commit();
    
    theSession.deleteUndoMark(markId69, null);
    
    theSession.setUndoMarkName(markId35, "Radial Dimension");
    
    pmiRadialDimensionBuilder5.destroy();
    
    theSession.deleteUndoMark(markId68, null);
    
    theSession.setUndoMarkVisibility(markId35, null, nxopen.Session.MarkVisibility.VISIBLE);
    
    theSession.deleteUndoMark(markId67, null);
    
    theSession.deleteUndoMark(markId65, null);
    
    theSession.deleteUndoMark(markId63, null);
    
    theSession.deleteUndoMark(markId61, null);
    
    theSession.deleteUndoMark(markId59, null);
    
    theSession.deleteUndoMark(markId57, null);
    
    theSession.deleteUndoMark(markId38, null);
    
    theSession.cleanUpFacetedFacesAndEdges();
    
    // ----------------------------------------------
    //   Menu: Tools->Journal->Stop Recording
    // ----------------------------------------------
  
  }
  
  public static final int getUnloadOption() { return nxopen.BaseSession.LibraryUnloadOption.IMMEDIATELY; }
  
}
