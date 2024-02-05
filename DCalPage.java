package com.dosingcalculator.webpages;

import org.openqa.selenium.By;

import com.dosingcalculator.utilities.BaseClass;

public class DCalPage extends BaseClass {

	//	public static By rdoIntYes = By.id("");
	//	public static By rdolnk = By.id("");
	
	//List of Web elements present in "Dosing Calculator", "Dosing Considerations", "Why Frequent" and "User Guide" Web pages
	
	
//Dosing Calculator Page elements
	//	SECTION - Use Watson Body Water Calculator?
	// "Yes" radio button
	public static By rdoIntYes = By.id("MainContent_rblUsePatient_0");
	
	// "No" radio button
	public static By rdoIntNo  = By.id("MainContent_rblUsePatient_0");

	//Dosing calculator tab link on the top header
	public static By rdolnkTabDcal = By.id("HyperLink1");
	
	
	//Tab to navigate to Dosing Calculator Page that contains the Use Calculator and Direct Entry options
	public static By tabDosingCalc = By.cssSelector("#liNxDosingCalculatorLink");
	
	//The label text present in Use Calculator Page (i.e., "Enter patient parameters")
	public static By lblPatientParameters = By.cssSelector("#content > div > div > span:nth-child(16)");
	
	//Radio Button to choose Use Calculator option that is present in Dosing Calculator Page
	public static By rdoUseCalc = By.id("rbUseCalculator");
	
	//Radio Button to choose Direct Entry option that is present in Dosing Calculator Page
	public static By rdoDirectEntry = By.id("rbDirEnt");
	
	//The Label text that indicates the Use Calculator Radio Button option that is present in Dosing Calculator Page
	public static By lblUseCalc = By.cssSelector("#MainContent_BodyWaterSelect > label:nth-child(1) > span");
	
	//Radio button to choose gender as Male that is present in Use Calculator Page
	public static By rdoSexMale = By.id("rbSexM");
	
	//Radio button to choose gender as Female that is present in Use Calculator Page
	public static By rdoSexFemale = By.id("rbSexF");
	
	//Tab to navigate to Settings Page that is present in the Dosing Calculator Page
	public static By tabSettings = By.id("liSettingsLink");
	
	//The Label text present in Settings Page (i.e., "Dosing Calculator Settings")
	public static By lblSettings = By.cssSelector("#content > div > div > div:nth-child(1) > div.col-xs-8.col-sm-8.col-md-8.col-lg-8.centerAlign.bigheader > span");
	
	//Tab to navigate to Dosing Considerations Page that is present in the Dosing Calculator Page
	public static By tabDosingConsider = By.id("liReferencesLink");
	
	//The Label text present in Dosing Considerations Page (i.e., "Prescribing patient-centered hemodialysis at home")
	public static By lblDosingConsider = By.cssSelector("#page-wrapper--dosing-considerations > div > div.col-xs-12.col-sm-12.block--prescribing-considerations > h2");
	
	//Tab to navigate to Why Frequent Page that is present in the Dosing Calculator Page
	public static By tabWhyFrequent = By.id("liWhyMoreFrequentLink");
	
	//The Label text present in Why Frequent Page (i.e., "More frequent hemodialysis (5 or 6 treatments per week) has shown the following clinical benefits:")
	public static By lblWhyFrequent = By.cssSelector("#page-wrapper--more-frequent > div > div.col1.col-xs-6.col-sm-6.col-md-6 > h3");
	
	//Tab to navigate to User Guide Page that is present in the Dosing Calculator Page
	public static By btnUserGuide = By.cssSelector("#liInstructionsLink > a");
	
	//Button to sign out from Dosing Calculator Application that is present in the Dosing Calculator Page
	public static By btnSignOut = By.cssSelector("#HeadLoginView_HeadLoginStatus");

	//Text Box entry for Total Body Water parameter used in Direct Entry Page
	public static By tbxTotalBodyWater = By.id("txtTBW");

	//Text Box entry for Age parameter used in Use Calculator Page
	public static By tbxAge = By.id("txtAge");

	//Text Box entry for Weight parameter used in Use Calculator Page
	public static By tbxWeight = By.id("txtWeight");

	//Text Box entry for Height parameter used in Use Calculator Page
	public static By tbxHeight = By.id("txtHeight");

	//Text Box entry for Blood Flow Rate used in both Use Calculator and Direct Entry Page
	public static By tbxBFR = By.id("txtBloodFlowRate");

	//Text Box entry for Residual Renal function parameter used in both Use Calculator and Direct Entry Page
	public static By tbxResidualRenal = By.cssSelector("#txtResidualRenal");

	//Text Box entry for Treatment maximum UF rate used in Use Calculator Page
	public static By tbxMaxUFRate = By.id("txtMaxUFRate");

	//Text Box entry for Weekly UF volume parameter used in both Use Calculator and Direct Entry Page
	public static By tbxWeeklyUFvolume = By.id("txtWeeklyUFvolume");

	//Text Box entry for minimum hours per week parameter used in both Use Calculator and Direct Entry Page
	public static By tbxMinHoursWeek = By.id("txtMinHoursWeek");

	//Text Box entry for Target weekly stdKt/V parameter used in both Use Calculator and Direct Entry Page
	public static By tbxStandardkt = By.id("txtTargetWeeklystdKt");

	//Radio button for dialysate flow rates parameter (i.e., value = 18) used in both Use Calculator and Direct Entry Page
	public static By rdoDFR18 = By.id("rbDFR18"); 

	//Radio button for dialysate flow rates parameter (i.e., value = 12) used in both Use Calculator and Direct Entry Page
	public static By rdoDFR12 = By.id("rbDFR12");

	//Calculate Button that is present in Dosing Calculator Page which is used in both Use Calculator and Direct Entry Page
	public static By btnCalc = By.xpath("//input[@id='btnCalculate']");

	//Text Box entry for Cycler maximum UF rate parameter used in Direct Entry Page
	public static By tbxCycMaxUFR = By.id("txtCyclerSettingMaxUFRate"); 

	//Use residual renal function check box present in both Use Calculator and Direct Entry Page
	public static By chkUseRFR = By.id("ShowResidualRenalCheckbox");
	
	//Treatment Options Table Header present in Use Calculator Page after calculation button is clicked
	public static By lblTreatmentOptionsTable = By.cssSelector("#ShowResults2 > div.col-xs-12.alert.alert-info.rsltsHdr > p > span");

	//Print Button present in Direct Entry Page
	public static By btnFormatPrint = By.id("btnPrint");
	
	//A blue color help message that appears for Residual renal function parameter present in both Use Calculator and Direct Entry Page
	public static By lblRenalfuncMsg = By.cssSelector("#renalFunctionMsg > div:nth-child(2) > span");
	
	//Dosing Calculator Application Build Version present in Dosing Calculator, Settings, Dosing Considerations, Why more frequent pages
	public static By lblVersion = By.id("BuildNum");
	
	//Hide-Show Filter button present in Direct Entry Page after Calculate button is clicked
	public static By btnHideShowFilter = By.id("btnFilter");
	
	//Hour Drop Down Box present in Direct Entry Page after Calculate button is clicked
	public static By ddwHour = By.id("ddDurationHrs");
	
	//Minute Drop Down Box present in Direct Entry Page after Calculate button is clicked
	public static By ddwMinute = By.id("ddDurationMins");
	
	//Generate button present in Direct Entry Page after Calculate button is clicked
	public static By btnGenerate = By.id("btnGenerateDuration");
	
	//Check box present for 7 Treatments/week in Direct Entry Page after Calculate button is clicked
	public static By chkTreatmentPerWeek7 = By.id("cbFilter7");
	
	//Check box present for 6 Treatments/week in Direct Entry Page after Calculate button is clicked
	public static By chkTreatmentPerWeek6 = By.id("cbFilter6");
	
	//Check box present for 5 Treatments/week in Direct Entry Page after Calculate button is clicked
	public static By chkTreatmentPerWeek5 = By.id("cbFilter5");
	
	//Check box present for 60 under Treatment Volume (L) in Direct Entry Page after Calculate button is clicked
	public static By chkTreatmentVolume60 = By.id("cbFilterTV60"); 
	
	//Apply button for applying the filter options
	public static By btnApply = By.id("btnApplyFilterOptions");
	
	//Web Element ID of the Reset Button present in both Use Calculator and Direct Entry Page
	public static By btnResetID = By.id("MainContent_btnReset");
	
	//Web Element CSS Selector of the Reset Button present in both Use Calculator and Direct Entry Page
	public static By btnResetCSS = By.cssSelector("#MainContent_btnReset");
	
	//Web Element XPath Selector of the Reset Button present in both Use Calculator and Direct Entry Page
	public static By btnResetXPath = By.xpath("//input[@id='MainContent_btnReset']");

	//The Label text present in Use Calculator page to indicate the Total Body Water parameter in Use Calculator Page
	public static By lblTotalBodyWater = By.id("txtTotalBodyWater");
	
	//Treatment Options Header present in Use Calculator Page after calculation button is clicked
	public static By lblTreatmentOptionsHeader = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(1) > th:nth-child(2)");
	
	//Treatment Parameters Header present in Use Calculator Page after calculation button is clicked
	public static By lblTreatmentParametersHeader = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(1) > th.tdCalcResultsHeader.border-left");
	
	/************************************************************************************************************************************
	 * Declaration of the Web Elements (label texts) for verifying the actual results with the expected results (stored in array of strings) 
	 * of the Use calculator and Direct Entry calculations starts here for TP1001
	 ************************************************************************************************************************************/
	
	//The following Label texts are used to inspect Target (stdKt/V), Single Pool (Kt/V) and Dialysate Flow Rate (ml/min) column values in Treatment Option Results table in Use Calculator Page - Test Case 2 in TP1001
	
	public static By lblUseCalc_TC2_stdKtV_1 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(4) > td.frequencygroupwithbordernohighlight.rsltsTblCol4");
	
	public static By lblUseCalc_TC2_KtV_1 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(4) > td.frequencygroupwithbordernohighlight.rsltsTblCol5");
	
	public static By lblUseCalc_TC2_mlmin_1 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(4) > td.frequencygroupwithbordernohighlight.rsltsTblCol7");
	
	public static By lblUseCalc_TC2_stdKtV_2 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(5) > td.frequencygroupwithbordernohighlight.rsltsTblCol4");
	
	public static By lblUseCalc_TC2_KtV_2 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(5) > td.frequencygroupwithbordernohighlight.rsltsTblCol5");
	
	public static By lblUseCalc_TC2_mlmin_2 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(5) > td.frequencygroupwithbordernohighlight.rsltsTblCol7");
	
	public static By lblUseCalc_TC2_stdKtV_3 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(6) > td.frequencygroupwithbordernohighlight.rsltsTblCol4");
	
	public static By lblUseCalc_TC2_KtV_3 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(6) > td.frequencygroupwithbordernohighlight.rsltsTblCol5");
	
	public static By lblUseCalc_TC2_mlmin_3 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(6) > td.frequencygroupwithbordernohighlight.rsltsTblCol7");
	
	//End of Label texts that are used to inspect Target (stdKt/V), Single Pool (Kt/V) and Dialysate Flow Rate (ml/min) column values in Treatment Option Results table in Use Calculator Page - Test Case 2 in TP1001
	
	//The following Label texts are used to inspect if Treatment Option Results table has rows for 7, 6 and 5 Treatments/Week in Direct Entry Page in Test Case 2 in TP1001
	
	public static By lblDirectEntry_TC2_Volume_1 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(4) > td.frequencygroupwithbordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC2_Volume_2 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(5) > td.frequencygroupwithnobordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC2_Volume_3 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(6) > td.frequencygroupwithnobordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC2_Volume_4 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(7) > td.frequencygroupwithbordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC2_Volume_5 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(8) > td.frequencygroupwithnobordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC2_Volume_6 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(9) > td.frequencygroupwithnobordernohighlight.rsltsTblCol3");
	
	//The End of Label texts that are used to inspect if Treatment Option Results table has rows for 7, 6 and 5 Treatments/Week in Direct Entry Page in Test Case 2 in TP1001
	
	//After selecting the check boxes for 5 - under Treatments/Week and 60 under Treatment Volume (L) this label text is used to verify the volume entry in Treatment Option Results table in Direct Entry Page in Test case 2 in TP1001
	
	public static By lblDirectEntry_TC2_Volume_7 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(4) > td.frequencygroupwithbordernohighlight.rsltsTblCol3");
	
	//The following label texts are the actual volume entries in Treatment options table in Direct Entry page in Test Case 1 in TP1001
	
	public static By lblDirectEntry_TC1_Volume_1 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(4) > td.frequencygroupwithbordernohighlight.rsltsTblCol3");
		
	public static By lblDirectEntry_TC1_Volume_2 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(5) > td.frequencygroupwithnobordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_Volume_3 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(6) > td.frequencygroupwithnobordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_Volume_4 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(7) > td.frequencygroupwithnoborderandhighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_Volume_5 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(8) > td.frequencygroupwithbordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_Volume_6 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(9) > td.frequencygroupwithnobordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_Volume_7 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(10) > td.frequencygroupwithnobordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_Volume_8 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(11) > td.frequencygroupwithnoborderandhighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_Volume_9 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(12) > td.frequencygroupwithbordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_Volume_10 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(13) > td.frequencygroupwithnobordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_Volume_11 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(14) > td.frequencygroupwithnoborderandhighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_Volume_12 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(15) > td.frequencygroupwithbordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_Volume_13 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(16) > td.frequencygroupwithnobordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_Volume_14 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(17) > td.frequencygroupwithnoborderandhighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_Volume_15 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(18) > td.frequencygroupwithbordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_Volume_16 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(19) > td.frequencygroupwithnobordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_Volume_17 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(20) > td.frequencygroupwithnoborderandhighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_Volume_18 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(21) > td.frequencygroupwithbordernohighlight.rsltsTblCol3");
	
	//The End of Label texts of the actual volume entries in Treatment options table in Direct Entry page in Test Case 1 in TP1001
	
	//These values are the expected volume entries in Treatment options table in Direct Entry page in Test Case 1 in TP1001
	
	public static String strVolume_1 = "20", strVolume_2 = "25", strVolume_3 = "30", strVolume_4 = "30", strVolume_5 = "25", strVolume_6 = "30", 
						 strVolume_7 = "40", strVolume_8 = "40", strVolume_9 = "30", strVolume_10 = "40", strVolume_11 = "50", strVolume_12 = "40", 
						 strVolume_13 = "50", strVolume_14 = "50", strVolume_15 = "50", strVolume_16 = "60", strVolume_17 = "60", strVolume_18 = "60";
	
	//The following label texts are the actual entries in Treatment Duration Results in Direct Entry page in Test Case 1 in TP1001
	
	public static By lblDirectEntry_TC1_Week_1 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(4) > td.frequencygroupwithbordernohighlight.rsltsTblCol1");
	
	public static By lblDirectEntry_TC1_Week_2 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(5) > td.frequencygroupwithborderandhighlight.rsltsTblCol1");
	
	public static By lblDirectEntry_TC1_Duration_1 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(5) > td.frequencygroupwithborderandhighlight.rsltsTblCol2");
	
	public static By lblDirectEntry_TC1_Duration_2 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(5) > td.frequencygroupwithborderandhighlight.rsltsTblCol2");
	
	//The end of label texts of the actual entries in Treatment Duration Results in Direct Entry page in Test Case 1 in TP1001
	
	//These values are the expected entries in Treatment Duration Results in Direct Entry page in Test Case 1 in TP1001
	
	public static String strWeek_1 = "7", strWeek_2 = "6", strDuration_1 = "2:40", strDuration_2 = "2:40";	
	
	//Actual results in Treatment Options Table - 3 for Direct Entry TC1
	
	//After selecting the check boxes for 7 treatment/week and 6 treatment/week and clicking the Apply button, the following label texts 
	//are the actual entries in Treatment Option Results table in Direct Entry Page in Test Case 1 in TP1001 
	
	public static By lblDirectEntry_TC1_Week1 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(4) > td.frequencygroupwithbordernohighlight.rsltsTblCol1");
	
	public static By lblDirectEntry_TC1_Week2 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(5) > td.frequencygroupwithnobordernohighlight.rsltsTblCol1");
	
	public static By lblDirectEntry_TC1_Week3 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(6) > td.frequencygroupwithnobordernohighlight.rsltsTblCol1");
	
	public static By lblDirectEntry_TC1_Week4 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(7) > td.frequencygroupwithnoborderandhighlight.rsltsTblCol1");
	
	public static By lblDirectEntry_TC1_Week5 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(8) > td.frequencygroupwithbordernohighlight.rsltsTblCol1");
	
	public static By lblDirectEntry_TC1_Week6 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(9) > td.frequencygroupwithnobordernohighlight.rsltsTblCol1");
	
	public static By lblDirectEntry_TC1_Week7 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(10) > td.frequencygroupwithnobordernohighlight.rsltsTblCol1");
	
	public static By lbl_DirectEntryTC1_Week8 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(11) > td.frequencygroupwithnoborderandhighlight.rsltsTblCol1");
	
	//The end of label text in Treatment Option Results table in Direct Entry Page in Test Case 1 in TP1001 
	
	//After selecting the check boxes for 7 treatment/week and 6 treatment/week and clicking the Apply button, the following values
	//are the expected entries in Treatment Option Results table in Direct Entry Page in Test Case 1 in TP1001 
	
	public static String strWeek1 = "7", strWeek2 = "7", strWeek3 = "7", strWeek4 = "7", strWeek5 = "6", strWeek6 = "6", strWeek7 = "6", strWeek8 = "6";
	
	//The label text is a Treatment Duration Help Text which is a legend below the specified Treatment Duration Results table 
	//indicating System One S is required in Direct Entry Page - Test Case 1 in TP1001
	
	public static By lblDurationHelp = By.id("MainContent_HighFlowLegendDuration");
	
	//This label text is the actual row in specified Treatment Duration Results table for entries with Dialysate flow Rate > 12 L/hr.
	//in Direct Entry Page - Test Case 1 in TP1001
	public static By lblDirectEntry_TC1_DialysateL_hr = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(8) > td.frequencygroupwithborderandhighlight.rsltsTblCol6");
	
	//This value is the expected row in specified Treatment Duration Results table for entries with Dialysate flow Rate > 12 L/hr.
	//in Direct Entry Page - Test Case 1 in TP1001
	public static String strDialysateL_hr = "14.4";
	
	//The following are the label texts to inspect the volume entries for each Treatments/week entry in the specified Treatment Duration Results Table in Direct Entry - Test Case 1 in TP1001
	
	public static By lblDirectEntry_TC1_Vol_1 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(4) > td.frequencygroupwithbordernohighlight.rsltsTblCol3");
		
	public static By lblDirectEntry_TC1_Vol_2 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(5) > td.frequencygroupwithbordernohighlight.rsltsTblCol3");
		
	public static By lblDirectEntry_TC1_Vol_3 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(6) > td.frequencygroupwithbordernohighlight.rsltsTblCol3");
		
	public static By lblDirectEntry_TC1_Vol_4 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(7) > td.frequencygroupwithbordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_Vol_5 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(8) > td.frequencygroupwithborderandhighlight.rsltsTblCol3");
	
	//End of label texts to inspect the volume entries for each Treatments/week entry in the specified Treatment Duration Results Table in Direct Entry - Test Case 1 in TP1001
	
	//The following are the expected results of the volume entries for each Treatments/week entry in the specified Treatment Duration Results Table in Direct Entry - Test Case 1 in TP1001
	
	public static String strVol_1 = "20", strVol_2 = "30", strVol_3 = "40", strVol_4 = "50", strVol_5 = "60";	
	
	//The label text is the maximum flow fraction column header present in the Use Calculator Page in Test Case 1 in TP1001
	
	public static By lblMaxFlowFractionHeader = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(2) > td.tdCalcResultsHeader.rsltsTblCol8");
	
	//After specifying Treatment Duration as 4 hours and 10 minutes and then clicking Generate Button, the following label texts are
	//the entries in specified Treatment Duration Results Table in Direct Entry Page - Test Case 1 in TP1001
	
	public static By lblDirectEntry_TC1_TWeek_1 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(4) > td.frequencygroupwithbordernohighlight.rsltsTblCol1");
	
	public static By lblDirectEntry_TC1_TWeek_2 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(5) > td.frequencygroupwithbordernohighlight.rsltsTblCol1");
	
	public static By lblDirectEntry_TC1_TWeek_3 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(6) > td.frequencygroupwithbordernohighlight.rsltsTblCol1");
	
	public static By lblDirectEntry_TC1_TWeek_4 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(7) > td.frequencygroupwithbordernohighlight.rsltsTblCol1");
	
	public static By lblDirectEntry_TC1_TWeek_5 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(8) > td.frequencygroupwithborderandhighlight.rsltsTblCol1");
	
	public static By lblDirectEntry_TC1_TDur_1 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(5) > td.frequencygroupwithbordernohighlight.rsltsTblCol2");
	
	public static By lblDirectEntry_TC1_TDur_2 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(5) > td.frequencygroupwithbordernohighlight.rsltsTblCol2");
	
	public static By lblDirectEntry_TC1_TDur_3 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(6) > td.frequencygroupwithbordernohighlight.rsltsTblCol2");
	
	public static By lblDirectEntry_TC1_TDur_4 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(7) > td.frequencygroupwithbordernohighlight.rsltsTblCol2");
	
	public static By lblDirectEntry_TC1_TDur_5 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(8) > td.frequencygroupwithborderandhighlight.rsltsTblCol2");
	
	public static By lblDirectEntry_TC1_TVol_1 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(4) > td.frequencygroupwithbordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_TVol_2 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(5) > td.frequencygroupwithbordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_TVol_3 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(6) > td.frequencygroupwithbordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_TVol_4 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(7) > td.frequencygroupwithbordernohighlight.rsltsTblCol3");
	
	public static By lblDirectEntry_TC1_TVol_5 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(8) > td.frequencygroupwithborderandhighlight.rsltsTblCol3");
	
	//The end of the entries in specified Treatment Duration Results Table in Direct Entry Page - Test Case 1 in TP1001
	
	//After specifying Treatment Duration as 4 hours and 10 minutes and then clicking Generate Button, the following values are
	//the expected entries in specified Treatment Duration Results Table in Direct Entry Page - Test Case 1 in TP1001
	public static String strTWeek_1 = "7", strTWeek_2 = "6", strTWeek_3 = "5", strTWeek_4 = "2 on, 1 off", strTWeek_5 = "4", 
						 strTDur_1 = "4:10", strTDur_2 = "4:10", strTDur_3 = "4:10", strTDur_4 = "4:10", strTDur_5 = "4:10", 
						 strTVol_1 = "20", strTVol_2 = "30", strTVol_3 = "40", strTVol_4 = "50", strTVol_5 = "60";
	
	//After specifying Treatment Duration as 4 hours and 10 minutes and then clicking Generate Button, the following label texts are 
	//the actual entries in specified Treatment Options Results Table in Direct Entry Page - Test Case 1 in TP1001	
	
	public static By lblDirectEntry_TC1_TDur1 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(5) > td.frequencygroupwithnobordernohighlight.rsltsTblCol2");
	
	public static By lblDirectEntry_TC1_TDur2 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(9) > td.frequencygroupwithnobordernohighlight.rsltsTblCol2");
	
	public static By lblDirectEntry_TC1_TDur3 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(13) > td.frequencygroupwithnobordernohighlight.rsltsTblCol2");
	
	public static By lblDirectEntry_TC1_TDur4 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(16) > td.frequencygroupwithnobordernohighlight.rsltsTblCol2");
	
	public static By lblDirectEntry_TC1_TDur5 = By.cssSelector("#MainContent_tblResultsWithFF > tbody > tr:nth-child(20) > td.frequencygroupwithnoborderandhighlight.rsltsTblCol2");
	
	//The end of the entries in specified Treatment Options Results Table in Direct Entry Page - Test Case 1 in TP1001
	
	//After specifying Treatment Duration as 4 hours and 10 minutes and then clicking Generate Button, the following values are 
	//the expected entries in specified Treatment Options Results Table in Direct Entry Page - Test Case 1 in TP1001
	
	public static String strTDur1 = "3:10", strTDur2 = "3:30", strTDur3 = "3:30", strTDur4 = "4:10", strTDur5 = "4:10";
	
	//The following are the check boxes used to verify - Filter by (select all that apply) section in Treatment Options Table in Direct Entry Page - Test Case 1 in TP1001
	
	public static By chkFiterBy_Week7 = By.id("cbFilter7");
	
	public static By chkFiterBy_Week6 = By.id("cbFilter6");
	
	public static By chkFiterBy_Week5 = By.id("cbFilter5");
	
	public static By chkFiterBy_Week4_7 = By.id("cbFilter4_7");
	
	public static By chkFiterBy_Week4 = By.id("cbFilter4");
	
	public static By chkFiterBy_Week3_5 = By.id("cbFilter3_5");
	
	public static By chkFiterBy_Vol20 = By.id("cbFilterTV20");
	
	public static By chkFiterBy_Vol25 = By.id("cbFilterTV25");
	
	public static By chkFiterBy_Vol30 = By.id("cbFilterTV30");
	
	public static By chkFiterBy_Vol40 = By.id("cbFilterTV40");
	
	public static By chkFiterBy_Vol50 = By.id("cbFilterTV50");
	
	public static By chkFiterBy_Vol60 = By.id("cbFilterTV60");
	
	//The end of check boxes in treatment options table in Direct Entry Page - Test Case 1 in TP1001
	
	//After specifying Treatment Duration as 4 hours and 10 minutes and then clicking Generate Button, this array contains 
	//the actual entries in specified Treatment Options Results Table in Direct Entry Page - Test Case 1 in TP1001	
	
	public static By[] DirectEntry_TC1_TreatmentOptionsActual = { lblDirectEntry_TC1_TDur1, lblDirectEntry_TC1_TDur2, 
																  lblDirectEntry_TC1_TDur3, lblDirectEntry_TC1_TDur4, 
																  lblDirectEntry_TC1_TDur5 };
	
	//After specifying Treatment Duration as 4 hours and 10 minutes and then clicking Generate Button, this array contains 
	//the expected entries in specified Treatment Options Results Table in Direct Entry Page - Test Case 1 in TP1001	
	
	public static String[] DirectEntry_TC1_TreatmentOptionsStored = { strTDur1, strTDur2, strTDur3, strTDur4, strTDur5 };
	
	//This array is used to verify the actual volume entries in Treatment options table in Direct Entry page in Test Case 1 in TP1001
	
	public static By[] DirectEntry_TC1_TreatmentOptionsActual_1 = { lblDirectEntry_TC1_Volume_1, lblDirectEntry_TC1_Volume_2, lblDirectEntry_TC1_Volume_3, 
			  						  								lblDirectEntry_TC1_Volume_4, lblDirectEntry_TC1_Volume_5, lblDirectEntry_TC1_Volume_6, 
			  						  								lblDirectEntry_TC1_Volume_7, lblDirectEntry_TC1_Volume_8, lblDirectEntry_TC1_Volume_9,
			  						  								lblDirectEntry_TC1_Volume_10, lblDirectEntry_TC1_Volume_11, lblDirectEntry_TC1_Volume_12,
			  						  								lblDirectEntry_TC1_Volume_13, lblDirectEntry_TC1_Volume_14, lblDirectEntry_TC1_Volume_15,
			  						  								lblDirectEntry_TC1_Volume_16, lblDirectEntry_TC1_Volume_17, lblDirectEntry_TC1_Volume_18 };

	//This array is used to store the expected volume entries in Treatment options table in Direct Entry page in Test Case 1 in TP1001
	
	public static String[] DirectEntry_TC1_TreatmentOptionsStored_1 = { strVolume_1, strVolume_2, strVolume_3, strVolume_4, strVolume_5, 
																		strVolume_6, strVolume_7, strVolume_8, strVolume_9, strVolume_10, 
																		strVolume_11, strVolume_12, strVolume_13, strVolume_14, strVolume_15,
																		strVolume_16, strVolume_17, strVolume_18 };
	
	//After specifying Treatment Duration as 4 hours and 10 minutes and then clicking Generate Button, this array contains the actual
	//entries in specified Treatment Duration Results Table in Direct Entry Page - Test Case 1 in TP1001	
	public static By[] DirectEntry_TC1_TreatmentDurationActual = { lblDirectEntry_TC1_TWeek_1, lblDirectEntry_TC1_TWeek_2, lblDirectEntry_TC1_TWeek_3, 
																   lblDirectEntry_TC1_TWeek_4, lblDirectEntry_TC1_TWeek_5, lblDirectEntry_TC1_TDur_1, 
																   lblDirectEntry_TC1_TDur_2, lblDirectEntry_TC1_TDur_3, lblDirectEntry_TC1_TDur_4,
																   lblDirectEntry_TC1_TDur_5, lblDirectEntry_TC1_TVol_1, lblDirectEntry_TC1_TVol_2,
									 							   lblDirectEntry_TC1_TVol_3, lblDirectEntry_TC1_TVol_4, lblDirectEntry_TC1_TVol_5 };		

	//After specifying Treatment Duration as 4 hours and 10 minutes and then clicking Generate Button, this array contains the expected
	//entries in specified Treatment Duration Results Table in Direct Entry Page - Test Case 1 in TP1001		
	public static String[] DirectEntry_TC1_TreatmentDurationStored = { strTWeek_1, strTWeek_2, strTWeek_3, strTWeek_4, strTWeek_5,
										 							   strTDur_1, strTDur_2, strTDur_3, strTDur_4, strTDur_5,
										 							   strTVol_1, strTVol_2, strTVol_3, strTVol_4, strTVol_5 };
	
	//The array is to store the actual results of the volume entries for each Treatments/week entry in the specified Treatment Duration Results Table in Direct Entry - Test Case 1 in TP1001
	public static By[] DirectEntry_TC1_TreatmentDurationActual_1 = { lblDirectEntry_TC1_Vol_1, lblDirectEntry_TC1_Vol_2, 
																	 lblDirectEntry_TC1_Vol_3, lblDirectEntry_TC1_Vol_4, 
																	 lblDirectEntry_TC1_Vol_5 };

	//The array is to store the expected results of the volume entries for each Treatments/week entry in the specified Treatment Duration Results Table in Direct Entry - Test Case 1 in TP1001
	public static String[] DirectEntry_TC1_TreatmentDurationStored_1 = { strVol_1, strVol_2, strVol_3, strVol_4, strVol_5 };
	
	//This array is to verify actual row in specified Treatment Duration Results table for entries with Dialysate flow Rate > 12 L/hr.
	//in Direct Entry Page - Test Case 1 in TP1001
	public static By[] DirectEntry_TC1_TreatmentDurationActual_2 = { lblDirectEntry_TC1_DialysateL_hr };		

	//This array is to store the expected row in specified Treatment Duration Results table for entries with Dialysate flow Rate > 12 L/hr.
	//in Direct Entry Page - Test Case 1 in TP1001
	public static String[] DirectEntry_TC1_TreatmentDurationStored_2 = { strDialysateL_hr };	
	
	//This array is used to verify the actual entries in Treatment Duration Results in Direct Entry page in Test Case 1 in TP1001
	public static By[] DirectEntry_TC1_TreatmentDurationActual_3 = { lblDirectEntry_TC1_Week_1, lblDirectEntry_TC1_Week_2, lblDirectEntry_TC1_Duration_1, 
									   								 lblDirectEntry_TC1_Duration_2 };	
	
	//This array is used to store the expected entries in Treatment Duration Results in Direct Entry page in Test Case 1 in TP1001
	public static String[] DirectEntry_TC1_TreatmentDurationStored_3 = { strWeek_1, strWeek_2, strDuration_1, strDuration_2 };
	
	//After selecting the check boxes for 7 treatment/week and 6 treatment/week and clicking the Apply button, this array is used to
	//store the actual entries in Treatment Option Results table in Direct Entry Page in Test Case 1 in TP1001
	public static By[] DirectEntry_TC1_TreatmentOptionsActual_3 = { lblDirectEntry_TC1_Week1, lblDirectEntry_TC1_Week2, lblDirectEntry_TC1_Week3, 
																	lblDirectEntry_TC1_Week4, lblDirectEntry_TC1_Week5, lblDirectEntry_TC1_Week6 }; 
	
	//After selecting the check boxes for 7 treatment/week and 6 treatment/week and clicking the Apply button, this array is used to
	//store the expected entries in Treatment Option Results table in Direct Entry Page in Test Case 1 in TP1001
	public static String[] DirectEntry_TC1_TreatmentOptionsStored_3 = { strWeek1, strWeek2, strWeek3, strWeek4, strWeek5, strWeek6, 
																		strWeek7, strWeek8 };
		
	//This array is used to verify - Filter by (select all that apply) section in Treatment Options Table in Direct Entry Page - Test Case 1 in TP1001
	public static By[] DirectEntry_TC1_TreatmentTableChkBox = { chkFiterBy_Week7, chkFiterBy_Week6, chkFiterBy_Week5, chkFiterBy_Week4_7, 
																chkFiterBy_Week4, chkFiterBy_Week3_5, chkFiterBy_Vol20, chkFiterBy_Vol25,
																chkFiterBy_Vol30, chkFiterBy_Vol40, chkFiterBy_Vol50, chkFiterBy_Vol60 };
	
	//This array is used to verify if Treatment Option Results table has rows for 7, 6 and 5 Treatments/Week in Direct Entry Page in Test Case 2 in TP1001
	public static By[] DirectEntry_TC2_TreatmentOptionsActual_1 = { lblDirectEntry_TC2_Volume_1, lblDirectEntry_TC2_Volume_2, lblDirectEntry_TC2_Volume_3, 
									  								lblDirectEntry_TC2_Volume_4, lblDirectEntry_TC2_Volume_5, lblDirectEntry_TC2_Volume_6 };	
	
	//After selecting the check boxes for 5 - under Treatments/Week and 60 under Treatment Volume (L) this array is used to verify the volume entry in Treatment Option Results table in Direct Entry Page in Test case 2 in TP1001
	public static By[] DirectEntry_TC2_TreatmentOptionsActual_2 = { lblDirectEntry_TC2_Volume_7 };	
	
	//This array is used store the Treatment options, Parameters and Maximum Flow Fraction headers that are present in Use Calculator Page in Test Case 1 in TP1001
	public static By[] UseCalc_TC1_TreatmentTableHeaders = { lblTreatmentOptionsHeader, lblTreatmentParametersHeader, lblMaxFlowFractionHeader };
	
	//This array is used to verify Target (stdKt/V), Single Pool (Kt/V) and Dialysate Flow Rate (ml/min) column values in Treatment Option Results table in Use Calculator Page in Test Case 2 in TP1001
	public static By[] UseCalc_TC2_TreatmentOptionsActual = { lblUseCalc_TC2_stdKtV_1, lblUseCalc_TC2_KtV_1, lblUseCalc_TC2_mlmin_1, lblUseCalc_TC2_stdKtV_2,
															  lblUseCalc_TC2_KtV_2, lblUseCalc_TC2_mlmin_2, lblUseCalc_TC2_stdKtV_3, lblUseCalc_TC2_KtV_3, lblUseCalc_TC2_mlmin_3 };
	
}
