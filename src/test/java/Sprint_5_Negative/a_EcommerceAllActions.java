package Sprint_5_Negative;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.EcommercePage;
import objectRepository.Ecommerce_BrandsPage;
import objectRepository.Ecommerce_Brands_AddBrandPage;
import objectRepository.Ecommerce_Brands_UpdateBrandPage;
import objectRepository.Ecommerce_CategoryPage;
import objectRepository.Ecommerce_Category_AddCategoryPage;
import objectRepository.Ecommerce_Category_EditCategoryPage;
import objectRepository.Ecommerce_Ecom_TransactionsPage;
import objectRepository.Ecommerce_EcommerceOrdersPage;
import objectRepository.Ecommerce_EcommerceOrders_FilterPage;
import objectRepository.Ecommerce_Product_DescriptionPage;
import objectRepository.Ecommerce_ProductsListPage;
import objectRepository.Ecommerce_Products_AddProductSizesPage;
import objectRepository.Ecommerce_Products_AddProductStonePage;
import objectRepository.Ecommerce_Products_AddProductsPage;
import objectRepository.Ecommerce_Products_ProductSizesPage;
import objectRepository.Ecommerce_Products_ProductStonePage;
import objectRepository.Ecommerce_SubCategoryPage;
import objectRepository.Ecommerce_SubCategory_AddSubcategoryPage;
import objectRepository.Ecommerce_SubCategory_EditSubcategoryPage;
import objectRepository.Ecommerce_UpdateProductDetailsPage;
import objectRepository.Ecommerce_UpdateProductSizesPage;
import objectRepository.Ecommerce_UpdateProductStonePage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class a_EcommerceAllActions extends FMS_BaseClass {

	WebDriverUtility wUtil = new WebDriverUtility();
	JavaUtility jUtil = new JavaUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	
	@Test
	public void categoriesAllActionsTest() throws Exception
	{
		String CategorySearchValue = eUtil.readDataFromExcel("Sprint-5-Categ&Sub-Negative", 2, 1);
		String CategoryName = eUtil.readDataFromExcel("Sprint-5-Categ&Sub-Negative", 4, 1);
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
	
		Thread.sleep(4000);
		
		//1
		
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getEcommerceDrpDwn().click();
		Thread.sleep(2000);
		EcommercePage ePage = new EcommercePage(driver);
		ePage.getCategoryLnk().click();
		Thread.sleep(2000);
		Ecommerce_CategoryPage ecPage = new Ecommerce_CategoryPage(driver);
		ecPage.getSearchEdt().sendKeys(CategorySearchValue);
		Thread.sleep(2000);
		WebElement NoRecordsError = driver.findElement(By.xpath("//h5[.='No records found']"));
		Thread.sleep(2000);
		if (NoRecordsError.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "a_Searched Invalid Category Error");
		} 
		else 
		{
            System.out.println("Searched Category Found");
		}
		Thread.sleep(2000);
		ecPage.getSearchEdt().clear();
		Thread.sleep(2000);
		
		//2
		
		ecPage.getAddCategoryBtn().click();
		Thread.sleep(2000);
		Ecommerce_Category_AddCategoryPage ecaddPage = new Ecommerce_Category_AddCategoryPage(driver);
		ecaddPage.getEnterNameEdt().sendKeys(CategoryName);
		Thread.sleep(2000);
		ecaddPage.getAddBtn().click();
		WebElement AllFeildsError = driver.findElement(By.xpath("//div[@aria-label='All fields are required']"));
		Thread.sleep(1000);
		if (AllFeildsError.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "b_Adding Category By Giving Only Category Name Error");
		} 
		else 
		{
            System.out.println("Category Added Successfully");
		}
		Thread.sleep(4000);
		
		//3
		
		wUtil.clickOnChooseFileOption(driver, ecaddPage.getChooseFileBtn(), ImagePath); 
		Thread.sleep(2000);
		ecaddPage.getAddBtn().click();
		Thread.sleep(2000);
		try 
		{
			WebElement CategoryAlreadyExistError = driver.findElement(By.xpath("(//div[.=' Category Name Already Exists '])[2]"));
			if(CategoryAlreadyExistError.isDisplayed())
			{
				wUtil.takeScreenShot(driver, "c_Category Already Exist Error");
			}
		} 
		catch (Exception e)
		{
			wUtil.takeScreenShot(driver, "c_Category Added Successfully");
		}
		Thread.sleep(4000);
		
		//4
		
		ecPage.getSearchEdt().clear();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		ecPage.clickOnParticularCategoryEditBtn(driver, CategoryName);
		Thread.sleep(2000);
		Ecommerce_Category_EditCategoryPage eceditPage = new Ecommerce_Category_EditCategoryPage(driver);
		eceditPage.getEnterNameEdt().clear();
		Thread.sleep(2000);
		eceditPage.getUpdateBtn().click();
		Thread.sleep(2000);
		WebElement CategoryNameError = driver.findElement(By.xpath("//div[@aria-label='Category Updated Successfully']"));
		Thread.sleep(1000);
		if (CategoryNameError.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "d_Clearing Category Name While Updating Category Error");
		} 
		else 
		{
            System.out.println("Please Enter Category Name");
		}
		Thread.sleep(4000);		
		
		//5
		
        driver.navigate().refresh();
		Thread.sleep(2000);
		ecPage.getAddCategoryBtn().click();
		Thread.sleep(1000);
		ecaddPage.getAddBtn().click();
		Thread.sleep(1000);
		WebElement AllFeildsRequiredAdd = driver.findElement(By.xpath("//div[@aria-label='All fields are required']"));
		if (AllFeildsRequiredAdd.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "e_Category Adding Without Giving Any Details Error Test");
		} 
		else 
		{
            System.out.println("Added Successfully");
		}
		Thread.sleep(4000);
		
		//6
		
		Thread.sleep(2000);
        driver.navigate().refresh();
		Thread.sleep(2000);
		ecPage.clickOnParticularCategoryBootStrapBtnToDisableParticularCategory(driver, CategoryName);
		Thread.sleep(2000);
		WebElement BootStrapbutton = driver.findElement(By.xpath("//div[@aria-label='Category Updated Successfully']"));
		Thread.sleep(2000);
		if (BootStrapbutton.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "f_Clicking On Bootstrap Button Category Should Not Update Successfully");
		} 
		else 
		{
            System.out.println("Category not Updated");
		}
        Thread.sleep(4000);
		
		//7
		
        driver.navigate().refresh();
		Thread.sleep(2000);
		ecPage.clickOnParticularCategoryDeleteBtn(driver, CategoryName);
		Thread.sleep(2000);
		WebElement DeleteMsg = driver.findElement(By.xpath("//div[@aria-label='Successfully Deleted']"));
		Thread.sleep(1000);
		if (DeleteMsg.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "g_Category Should Not Delete");
		} 
		else 
		{
            System.out.println("Category Not Deleted");
		}
		
		
}
	
	
	@Test
	public void SubcategoriesAllActionsTest() throws Exception {
		WebDriverUtility wu=new WebDriverUtility();
		wu.waitUntilPageLoad(driver);
		String SubCategorySearchValue = eUtil.readDataFromExcel("Sprint-5-Categ&Sub-Negative", 9, 1);
		String CategoryName = eUtil.readDataFromExcel("Sprint-5-Categ&Sub-Negative", 11, 1);
		String SubCategoryName = eUtil.readDataFromExcel("Sprint-5-Categ&Sub-Negative", 12, 1);
		String SubCategoryNameRandom = eUtil.readDataFromExcel("Sprint-5-Categ&Sub-Negative", 12, 1)+jUtil.getRandomNum();
		String SelectType = eUtil.readDataFromExcel("Sprint-5-Categ&Sub-Negative", 13, 1);
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		
		//1
		Thread.sleep(2000);
        DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getEcommerceDrpDwn().click();
		Thread.sleep(2000);
		EcommercePage ePage = new EcommercePage(driver);
		ePage.getSubCategoryLnk().click();
		Thread.sleep(2000);
		Ecommerce_SubCategoryPage esPage = new Ecommerce_SubCategoryPage(driver);
		esPage.getSearchEdt().sendKeys(SubCategorySearchValue);
		Thread.sleep(2000);
		WebElement SnoRecordsFoundError = driver.findElement(By.xpath("//h5[.='No records found']"));
		Thread.sleep(1000);
		if (SnoRecordsFoundError.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "a_Searching Invalid SubCategory Error");
		} 
		else 
		{
            System.out.println("Searched SubCategory Found");
		}
		
		//2
		
		Thread.sleep(2000);
		esPage.getSearchEdt().clear();
		Thread.sleep(1000);
		esPage.getAddSubCategoryBtn().click();
		Thread.sleep(1000);
		Ecommerce_SubCategory_AddSubcategoryPage esaddsubPage = new Ecommerce_SubCategory_AddSubcategoryPage(driver);
		esaddsubPage.getAddBtn().click();
		Thread.sleep(1000);
		WebElement ImageRequiredError = driver.findElement(By.xpath("//div[@aria-label='Image is required']"));
		Thread.sleep(1000);
		if (ImageRequiredError.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "b_Adding SubCategory Without Giving Any Details Error");
		} 
		else 
		{
            System.out.println("SubCategory Added Successfully");
		}
		Thread.sleep(4000);
		
		//3
	    
		Thread.sleep(1000);
		Ecommerce_SubCategory_AddSubcategoryPage escascPage = new Ecommerce_SubCategory_AddSubcategoryPage(driver);
		wUtil.handleDropdownByVisibleText(CategoryName, escascPage.getCategoryNameDrpDwn());
		Thread.sleep(2000);
		esaddsubPage.getAddBtn().click();
		WebElement ImageRequiredError1 = driver.findElement(By.xpath("(//div[.=' Image is required '])[2]"));
		Thread.sleep(1000);
		if (ImageRequiredError1.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "c_SubCategory Adding By Giving Only Category DrpDwn Error");
		} 
		else 
		{
            System.out.println("SubCategory Added Successfully");
		}
		Thread.sleep(2000);
		
		//4
		
		esaddsubPage.getSubCategoryNameEdt().sendKeys(SubCategoryName);
	    Thread.sleep(2000);
		esaddsubPage.getAddBtn().click();
		Thread.sleep(1000);
		if (ImageRequiredError1.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "d_SubCategory Adding By Giving Category, SubCategory Names Error");
		} 
		else 
		{
            System.out.println("Category Added Successfully");
		}
        Thread.sleep(2000);   
        wUtil.clickOnChooseFileOption(driver, esaddsubPage.getChooseFileBtn(), ImagePath);  
        Thread.sleep(2000);  
        esaddsubPage.getAddBtn().click();  
        WebElement EnterTypeError = driver.findElement(By.xpath("//div[@aria-label='Please Enter Type']"));  
        Thread.sleep(2000);  
        if (EnterTypeError.isDisplayed()) 
  		{
  		    wUtil.takeScreenShot(driver, "e_SubCategory Adding Without Giving Type DrpDwn Error");
  		} 
  		else 
  		{
            System.out.println("SubCategory Added Successfully");
  		}
          
        Thread.sleep(2000);  
          
        //5
        
        Select s2 = new Select(esaddsubPage.getSelectTypeDrpDwn());
        s2.selectByVisibleText(SelectType); 
        Thread.sleep(2000);
        esaddsubPage.getAddBtn().click(); 
        try 
        {
        	WebElement SubCategoryAlreadyExistError = driver.findElement(By.xpath("(//div[.=' Sub Category Name is Already Existed '])[2]"));
            if(SubCategoryAlreadyExistError.isDisplayed())
            {
            	wUtil.takeScreenShot(driver, "f_SubCategory Already exist Error");
            }
            else
            {
    			System.out.println("SubCategory Added Successfully");
    		}
            Thread.sleep(000);
            esaddsubPage.getSubCategoryNameEdt().clear();
            Thread.sleep(2000);
            esaddsubPage.getSubCategoryNameEdt().sendKeys(SubCategoryNameRandom);
    	    Thread.sleep(2000);
    		esaddsubPage.getAddBtn().click();
    		Thread.sleep(4000);
    		WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.=' Subcategory Added Successfully '])[2]"));
            if(SuccessMsg.isDisplayed())
            {
            	wUtil.takeScreenShot(driver, "f_SubCategory Adding By Giving Valid Details Success");
            }
            else
            {
    			System.out.println("SubCategory Added Successfully");
            }
		} 
        catch (Exception e) 
        {
        	Thread.sleep(2000);
		}
        
        driver.navigate().refresh();
          
  	    Thread.sleep(5000);  
  	    esPage.clickOnParticularEditBtn(driver, SubCategoryNameRandom);
	    Thread.sleep(2000);
	    Ecommerce_SubCategory_EditSubcategoryPage esubeditPage = new Ecommerce_SubCategory_EditSubcategoryPage(driver);
	    Thread.sleep(5000);
	    esubeditPage.getUpdateBtn().click();
	    WebElement EditTypeRequired = driver.findElement(By.xpath("(//div[.=' Please Enter Type '])[2]"));
	    Thread.sleep(2000);
	    if (EditTypeRequired.isDisplayed())
   		{
   	    	wUtil.takeScreenShot(driver, "g_Without Giving Type While Editing Error");
   		} 
   		else 
   		{
            System.out.println("Added Successfully");
   		} 
        Thread.sleep(2000);
	       
           //8
           
        esubeditPage.getSubCategoryNameEdt().clear();
        Thread.sleep(2000);
        esubeditPage.getUpdateBtn().click();
        Thread.sleep(1000);
        WebElement EnterSubCategoryError = driver.findElement(By.xpath("//div[@aria-label='Please Enter Type']"));
        Thread.sleep(1000);
        //WebElement EnterSubCategoryError = driver.findElement(By.xpath("(//div[.=' Please Enter Type '])[2]"));
        //Thread.sleep(1000);
        if(EditTypeRequired.isDisplayed())
        {
        	wUtil.takeScreenShot(driver, "h_WithOut Giving SubCategory Name,Type While Updating Error");
        }
        else
        {
			System.out.println("Sub Category Updated Successfully");
		}
        Thread.sleep(2000);
        
        
        wUtil.handleDropdownByVisibleText("Select Category", escascPage.getCategoryNameDrpDwn());
        Thread.sleep(2000);
        esubeditPage.getUpdateBtn().click();
        Thread.sleep(2000);
        WebElement EnterSubCategoryError1 = driver.findElement(By.xpath("//div[@aria-label='Please Enter Type']"));
        Thread.sleep(1000);
        if(EnterSubCategoryError1.isDisplayed())
        {
        	wUtil.takeScreenShot(driver, "i_Updating Without Giving Category, SubCategory, Type Error");
        }
        else
        {
			System.out.println("Category Updated Successfully");
		}
        Thread.sleep(8000);
        esubeditPage.getCloseBtn().click();
        WebElement UpdateSubCategoryPageError = driver.findElement(By.xpath("//h1[.='Update SubCategory']"));
        if(UpdateSubCategoryPageError.isDisplayed())
        {
        	System.out.println("j_Update SubCategory Page Is Not Closed");
        }
        else
        {
			wUtil.takeScreenShot(driver, "j_Click On Close Btn Update SubCategory Page Should Not Close Error");
		}
        Thread.sleep(4000);
        esPage.clickOnParticularSubCategoryBootstrapBtnToDisableParticularSubCategory(driver, SubCategoryNameRandom);
        Thread.sleep(1000);
        //WebElement UpdateMsg = driver.findElement(By.xpath("(//div[.=' Sub Category Updated Successfully '])[2]"));
        //WebElement UpdateMsg = driver.findElement(By.xpath("//div[.=' Sub Category Updated Successfully ']"));
        WebElement UpdateMsg = driver.findElement(By.xpath("//div[@aria-label='Sub Category Updated Successfully']"));
        if(UpdateMsg.isDisplayed())
        {
        	wUtil.takeScreenShot(driver, "k_Clicking On Bootstrap Btn SubCategory Should Not Update Error");
        }
        else
        {
			System.out.println("SubCategory Not Updated");
		}
        Thread.sleep(6000);
        //esPage.clickOnParticularSubCategoryDeleteBtn(driver, SubCategoryNameRandom);
        //Thread.sleep(2000);
        esPage.clickOnParticularCategoryDeleteBtn(driver, CategoryName);
        Thread.sleep(2000);
        WebElement DeleteMsg = driver.findElement(By.xpath("//div[@aria-label='Successfully Deleted']"));
        Thread.sleep(2000);
        //WebElement DeleteMsg = driver.findElement(By.xpath("(//div[.=' Successfully Deleted '])[2]"));
        //Thread.sleep(1000);
        if(DeleteMsg.isDisplayed())
        {
        	wUtil.takeScreenShot(driver, "l_Clicking On Delete Btn SubCategory Should Not Delete Error");
        }
        else
        {
			System.out.println("SubCategory Not Deleted");
		}
        
	}
	//(//button[@class='btn-sm btn-edit bg-danger'])[1]
	
	
	@Test
	public void productsAllActionsTest() throws Exception
	{
		String ProductSearchValue = eUtil.readDataFromExcel("Sprint-5 Negative", 23, 1);
//		String AddProductCategoryName = eUtil.readDataFromExcel("Sprint-5 Negative", 26, 1);
//		String AddProductSubCategoryName = eUtil.readDataFromExcel("Sprint-5 Negative", 27, 1);
//		String AddProductSelectBrand = eUtil.readDataFromExcel("Sprint-5 Negative", 28, 1);
		String AddProductProductName = eUtil.readDataFromExcel("Sprint-5 Negative", 29, 1);
		String AddProductEnterVA = eUtil.readDataFromExcel("Sprint-5 Negative", 30, 1);
//		String AddProductSelectCarat = eUtil.readDataFromExcel("Sprint-5 Negative", 31, 1);
//		String AddProductSelectType = eUtil.readDataFromExcel("Sprint-5 Negative", 32, 1);
		String AddProductEnterPrice = eUtil.readDataFromExcel("Sprint-5 Negative", 33, 1);
		String AddProductEnterSize = eUtil.readDataFromExcel("Sprint-5 Negative", 34, 1);
		String AddProductEnterWeight = eUtil.readDataFromExcel("Sprint-5 Negative", 35, 1);
		String AddProductDescription = eUtil.readDataFromExcel("Sprint-5 Negative", 36, 1);
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		
		String ProductSizeSearchValue = eUtil.readDataFromExcel("Sprint-5 Negative", 26, 4);
		
		String AddProductSize = eUtil.readDataFromExcel("Sprint-5 Negative", 28, 4);
		String AddProductWeight = eUtil.readDataFromExcel("Sprint-5 Negative", 29, 4);
		
//		String UpdateProductSize = eUtil.readDataFromExcel("Sprint-5 Negative", 31, 4);
//		String UpdateProductWeight = eUtil.readDataFromExcel("Sprint-5 Negative", 32, 4);
		
		String ProductStoneSearchValue = eUtil.readDataFromExcel("Sprint-5 Negative", 26, 7);
		
		String AddProductStoneName = eUtil.readDataFromExcel("Sprint-5 Negative", 28, 7);
		String AddProductStoneColour = eUtil.readDataFromExcel("Sprint-5 Negative", 29, 7);
		String AddProductStonePrice = eUtil.readDataFromExcel("Sprint-5 Negative", 30, 7);
		String AddProductNoOfStones = eUtil.readDataFromExcel("Sprint-5 Negative", 31, 7);
		
//		String UpdateProductStoneName = eUtil.readDataFromExcel("Sprint-5 Negative", 33, 7);
//		String UpdateProductStoneColour = eUtil.readDataFromExcel("Sprint-5 Negative", 34, 7);
//		String UpdateProductStonePrice = eUtil.readDataFromExcel("Sprint-5 Negative", 35, 7);
//		String UpdateProductNoOfStones = eUtil.readDataFromExcel("Sprint-5 Negative", 36, 7);
		
//		String UpdateProductCategoryName = eUtil.readDataFromExcel("Sprint-5 Negative", 26, 10);
//		String UpdateProductSubCategoryName = eUtil.readDataFromExcel("Sprint-5 Negative", 27, 10);
//		String UpdateProductSelectBrand = eUtil.readDataFromExcel("Sprint-5 Negative", 28, 10);
//		String UpdateProductProductName = eUtil.readDataFromExcel("Sprint-5 Negative", 29, 10);
//		String UpdateProductEnterVA = eUtil.readDataFromExcel("Sprint-5 Negative", 30, 10);
//		String UpdateProductSelectCarat = eUtil.readDataFromExcel("Sprint-5 Negative", 31, 10);
//		String UpdateProductSelectType = eUtil.readDataFromExcel("Sprint-5 Negative", 32, 10);
//		String UpdateProductEnterPrice = eUtil.readDataFromExcel("Sprint-5 Negative", 33, 10);
//		String UpdateProductEnterSize = eUtil.readDataFromExcel("Sprint-5 Negative", 34, 10);
//		String UpdateProductEnterWeight = eUtil.readDataFromExcel("Sprint-5 Negative", 35, 10);
//		String UpdateProductDescription = eUtil.readDataFromExcel("Sprint-5 Negative", 36, 10);
//		String UpdateImagePath = eUtil.readDataFromExcel("ImagePath", 1, 1);
		
		
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getEcommerceDrpDwn().click();
		Thread.sleep(2000);
		EcommercePage ePage = new EcommercePage(driver);
		ePage.getProductsLnk().click();
		Thread.sleep(2000);
		Ecommerce_ProductsListPage eplPage = new Ecommerce_ProductsListPage(driver);
		eplPage.getSearchEdt().sendKeys(ProductSearchValue);
		Thread.sleep(2000);
		WebElement NoRecordsError = driver.findElement(By.xpath("//h5[.='No records found']"));
		if(NoRecordsError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "a_Searching Invalid Product Error");
		}
		else
		{
			System.out.println("Searched Product Displayed");
		}
		Thread.sleep(4000);
		eplPage.getSearchEdt().clear();
		Thread.sleep(1000);
		eplPage.getAddProductBtn().click();
		WebElement AddProductPage = driver.findElement(By.xpath("//h1[.='Add Product Details']"));
		Thread.sleep(1000);
		if(AddProductPage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "b_Click On Add Product Button Add Product Details Page should Not Display Error");
		}
		else
		{
			System.out.println("Add Product Page Not Displayed");
		}
		Thread.sleep(4000);
		Ecommerce_Products_AddProductsPage epapPage = new Ecommerce_Products_AddProductsPage(driver);
		WebElement CategoryDrpDwn = epapPage.getCategoryDrpDwn();
		Select s1 = new Select(CategoryDrpDwn);
		s1.selectByVisibleText("Nosepin");
		Thread.sleep(1000);
	    
		
		
//		WebElement SubCategoriesNotFoundError = driver.findElement(By.xpath("(//div[.=' SubCategories not found please add '])[2]"));
//		for(int i=2;i<=10;i++)
//        {
//			if (SubCategoriesNotFoundError.isDisplayed())
//			{
//				Robot r = new Robot();
//				Thread.sleep(6000);
//				r.keyPress((KeyEvent.VK_DOWN));
//				r.keyRelease((KeyEvent.VK_DOWN));
//			}            
//        }
		
		
		Thread.sleep(2000);
		epapPage.getAddBtn().click();
		WebElement ImageRequiredError = driver.findElement(By.xpath("(//div[.=' Image is required '])[2]"));
		if(ImageRequiredError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "d_Product Adding By Giving Only Category Name Error");
		}
		else
		{
			System.out.println("Product Added Successfully");
		}
		Thread.sleep(4000);
		WebElement SubCategoryDrpDwn = epapPage.getSubCategoryDrpDwn();
		Select s2 = new Select(SubCategoryDrpDwn);
		s2.selectByIndex(1);
		Thread.sleep(2000);
		epapPage.getAddBtn().click();
		Thread.sleep(1000);
		if(ImageRequiredError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "e_Product Adding By Giving Only Category, SubCategory Names Error");
		}
		else
		{
			System.out.println("Product Added Successfully");
		}
		Thread.sleep(4000);
		WebElement BrandNameDrpDwn = epapPage.getBrandNameDrpDwn();
		Select s3 = new Select(BrandNameDrpDwn);
		s3.selectByIndex(2);
		Thread.sleep(2000);
		epapPage.getAddBtn().click();
		Thread.sleep(1000);
		if(ImageRequiredError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "f_Product Adding By Giving Only Category, SubCategory, Brand Names Error");
		}
		else
		{
			System.out.println("Product Added Successfully");
		}
		Thread.sleep(4000);
		epapPage.getProductNameEdt().sendKeys(AddProductProductName);
		Thread.sleep(2000);
		epapPage.getAddBtn().click();
		Thread.sleep(1000);
		if(ImageRequiredError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "g_Product Adding By Giving Only Category, SubCategory, Brand, Product Names Error");
		}
		else 
		{
			System.out.println("Product Added Successfully");
		}
		Thread.sleep(4000);
		epapPage.getVaEdt().sendKeys(AddProductEnterVA);
		Thread.sleep(2000);
		epapPage.getAddBtn().click();
		Thread.sleep(1000);
		if(ImageRequiredError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "h_Product Adding By Giving Only Category, SubCategory, Brand, Product,Va%, Names Error");
		}
		else
		{
			System.out.println("Product Added Successfully");
		}
		Thread.sleep(4000);
		//WebElement SelectCarat = epapPage.getCaratDrpDwn();
//		Select s4 = new Select(SelectCarat);
//		s4.selectByIndex(2);
		Thread.sleep(2000);
		epapPage.getAddBtn().click();
		Thread.sleep(1000);
		if(ImageRequiredError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "i_Product Adding By Giving Only Category, SubCategory, Brand, Product,Va%, carat Names Error");
		}
		else
		{
			System.out.println("Product Added Successfully");
		}
		Thread.sleep(4000);
		WebElement TypeDrpDwn = epapPage.getTypeDrpDwn();
		Select s5 = new Select(TypeDrpDwn);
		s5.selectByIndex(1);
		Thread.sleep(2000);
		epapPage.getAddBtn().click();
		Thread.sleep(1000);
		if(ImageRequiredError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "j_Product Adding By Giving Only Category, SubCategory, Brand, Product,Va%, carat, Type Names Error");
		}
		else
		{
			System.out.println("Product Added Successfully");
		}
		Thread.sleep(4000);
		WebElement IsShownDrpDwn = epapPage.getIsShownDrpDwn();
		Select s6 = new Select(IsShownDrpDwn);
		s6.selectByIndex(1);
		Thread.sleep(2000);
		epapPage.getAddBtn().click();
		Thread.sleep(1000);
		if(ImageRequiredError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "k_Product Adding By Giving Only Category, SubCategory, Brand, Product,Va%, carat, Type, IsShown Names Error");
		}
		else
		{
			System.out.println("Product Added Successfully");
		}
		Thread.sleep(4000);
		epapPage.getPriceEdt().sendKeys(AddProductEnterPrice);
		Thread.sleep(2000);
		epapPage.getAddBtn().click();
		Thread.sleep(1000);
		if(ImageRequiredError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "l_Product Adding By Giving Only Category, SubCategory, Brand, Product,Va%, carat, Type, IsShown, Price Error");
		}
		else
		{
			System.out.println("Product Added Successfully");
		}
		Thread.sleep(4000);
		epapPage.getSizeEdt().sendKeys(AddProductEnterSize);
		Thread.sleep(2000);
		epapPage.getAddBtn().click();
		Thread.sleep(1000);
		if(ImageRequiredError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "m_Product Adding By Giving Only Category, SubCategory, Brand, Product,Va%, carat, Type, IsShown, Price, Size Error");
		}
		else
		{
			System.out.println("Product Added Successfully");
		}
		Thread.sleep(4000);
		epapPage.getWeightEdt().sendKeys(AddProductEnterWeight);
		Thread.sleep(2000);
		epapPage.getAddBtn().click();
		Thread.sleep(1000);
		if(ImageRequiredError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "n_Product Adding By Giving Only Category, SubCategory, Brand, Product,Va%, carat, Type, IsShown, Price, Size, Weight Error");
		}
		else
		{
			System.out.println("Product Added Successfully");
		}
		Thread.sleep(4000);
		epapPage.getDescriptionEdt().sendKeys(AddProductDescription);
		Thread.sleep(2000);
		epapPage.getAddBtn().click();
		Thread.sleep(1000);
		if(ImageRequiredError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "o_Product Adding By Giving Only Category, SubCategory, Brand, Product,Va%, carat, Type, IsShown, Price, Size, Weight, Description Error");
		}
		else
		{
			System.out.println("Product Added Successfully");
		}
		Thread.sleep(5000);
		wUtil.clickOnChooseFileOption(driver, epapPage.getChooseFileBtn(), ImagePath);
		Thread.sleep(2000);
		epapPage.getAddBtn().click();
		Thread.sleep(1000);
		WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.=' Product Added Successfully '])[2]"));
		Thread.sleep(1000);
		if(SuccessMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "p_Product Adding By Giving Only Category, SubCategory, Brand, Product,Va%, carat, Type, IsShown, Price, Size, Weight, Description, Image Success");
		}
		else
		{
			System.out.println("Product Not Added");
		}
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		eplPage.clickOnParticularProductWeightInfoBtn(driver, AddProductProductName);
		Thread.sleep(1000);
		WebElement ProductSizesPage = driver.findElement(By.xpath("//h4[.='Product Sizes']"));
		if(ProductSizesPage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "q_Clicking On Weight Info Button In Product List Page Product Sizes Page Should Not Display Error");
		}
		else
		{
			System.out.println("Product Sizes Page Not Displayed");
		}
		Thread.sleep(2000);
		Ecommerce_Products_ProductSizesPage eppsPage = new Ecommerce_Products_ProductSizesPage(driver);
		eppsPage.getSearchEdt().sendKeys(ProductSizeSearchValue);
		Thread.sleep(1000);
		WebElement SizesNoRecordsError = driver.findElement(By.xpath("//h5[.='No records found']"));
		if(SizesNoRecordsError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "r_Searching Invalid Size Error");
		}
		else
		{
			System.out.println("Searched Size displayed");
		}
		Thread.sleep(2000);
		eppsPage.getAddProductSizesBtn().click();
		Thread.sleep(1000);
		WebElement AddProductSizePage = driver.findElement(By.xpath("//h1[.='Add Product Size']"));
		if(AddProductSizePage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "s_Clicking On Add Product Size Button Add Product Sizes Page Should Not Display Error");
		}
		else
		{
			System.out.println("Add Product Size Page Is Not Displayed");
		}
		Thread.sleep(2000);
		Ecommerce_Products_AddProductSizesPage epapsizePage = new Ecommerce_Products_AddProductSizesPage(driver);
		epapsizePage.getProductSizeEdt().sendKeys(AddProductSize);
		Thread.sleep(1000);
		epapsizePage.getAddBtn().click();
		Thread.sleep(1000);
		WebElement EnterWeightError = driver.findElement(By.xpath("(//div[.=' Please Enter Weight '])[2]"));
		Thread.sleep(1000);
		if(EnterWeightError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "t_Adding Product Size By Giving Only Product Size Error");
		}
		else 
		{
		    System.out.println("Product Size Added Successfully");
		}
		Thread.sleep(4000);
		epapsizePage.getProductWeightEdt().sendKeys(AddProductWeight);
		Thread.sleep(2000);
		epapsizePage.getAddBtn().click();
	    Thread.sleep(1000);//
//		WebElement SizeAlreadyExistError = driver.findElement(By.xpath("(//div[.=' Size is Already Existed for this Product '])[2]"));
	    WebElement SuccessMsg55 = driver.findElement(By.xpath("(//div[.=' Product Size Added Successfully '])[2]"));
	    		
		if(SuccessMsg55.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "u_Size is Already Existed for this Product Error");
		}
		else 
		{
			System.out.println("Product Size Added Successfully");
		}
		
		Thread.sleep(1000);
		
		try 
		{
			driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
		} 
		catch (Exception e) 
		{
			Thread.sleep(1000);
		}		
		Thread.sleep(1000);
		driver.navigate().refresh();		
		Thread.sleep(2000);
		eppsPage.getEditBtn().click();
		Thread.sleep(2000);
		Ecommerce_UpdateProductSizesPage eupsPage = new Ecommerce_UpdateProductSizesPage(driver);
		eupsPage.getProductSizeEdt().clear();
		eupsPage.getUpdateBtn().click();
		Thread.sleep(1000);
		WebElement ClearSizeUpdateSuccessMsg = driver.findElement(By.xpath("(//div[.='  Product Size Updated Successfully '])[2]"));
		Thread.sleep(1000);
		if(ClearSizeUpdateSuccessMsg.isDisplayed())        //(//div[.=' Please Enter Size '])[2]
		{
			wUtil.takeScreenShot(driver, "v_Clearing Size While Updating Size Successfull Error");
		}
		else
		{
	        System.out.println("Product Size Not Updated Updated");
		}
		eppsPage.getEditBtn().click();
		Thread.sleep(2000);
		eupsPage.getProductSizeEdt().clear();
		Thread.sleep(2000);
		eupsPage.getProductWeightEdt().clear();
		Thread.sleep(2000);
		eupsPage.getUpdateBtn().click();
		Thread.sleep(1000);
		WebElement ClearSizeAndWeightSuccessMsg = driver.findElement(By.xpath("(//div[.='  Product Size Updated Successfully '])[2]"));
		Thread.sleep(1000);
		if(ClearSizeAndWeightSuccessMsg.isDisplayed())        //(//div[.=' Please Enter Size '])[2]
		{
			wUtil.takeScreenShot(driver, "w_Clearing Size And Weight While Updating Size Successfull Error");
		}
		else
		{
	        System.out.println("Product Size Not Updated");
		}
		Thread.sleep(5000);
		eppsPage.clickOnFrstProductBootstrapBtnInProductSizePage(driver);
		Thread.sleep(1000);
		WebElement SuccessUpdateMsg = driver.findElement(By.xpath("(//div[.='  Product Size Updated Successfully '])[2]"));
		Thread.sleep(1000);
		if(SuccessUpdateMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "x_Clicking On Bootstrap Button Product Size Should Not Update");
		}
		else
		{
			System.out.println("Product Size Not Updated");
		}
		Thread.sleep(5000);
		eppsPage.clickOnFrstProductDeleteBtnInProductSizePage(driver);
		Thread.sleep(1000);
		WebElement DeleteMsg = driver.findElement(By.xpath("(//div[.=' Successfully Deleted '])[2]"));
		Thread.sleep(1000);
		if(DeleteMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "y_Clicking On Delete Button Product Size Should Not Delete");
		}
		else
		{
			System.out.println("Product Size Not Deleted");
		}
		Thread.sleep(4000);
		dbPage.getEcommerceDrpDwn().click();
		Thread.sleep(1000);
		ePage.getProductsLnk().click();
		Thread.sleep(2000);

		eplPage.getStonesViewBtn().click();
		Thread.sleep(2000);
		WebElement ProductStonePage = driver.findElement(By.xpath("//h4[.='Product Stones']"));
		if(ProductStonePage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z_Clicking On Stone View Button Product Stone Page Should Not Display Error");
		}
		else
		{
			System.out.println("Product Stone Page Is Not Displayed");
		}
        Thread.sleep(1000);
		Ecommerce_Products_ProductStonePage eppstonePage = new Ecommerce_Products_ProductStonePage(driver);
		eppstonePage.getAddProductStoneBtn().click();
		Thread.sleep(1000);
		WebElement AddProductStonePage = driver.findElement(By.xpath("//h1[.='Add Product Stone']"));
		if(AddProductStonePage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z1a_Clicking On Add Product Stone Button Add Product Stone Page Should Not Open Error");
		}
		else
		{
			System.out.println("Add Product Stone Page Not Opened");
		}
		Thread.sleep(1000);
		Ecommerce_Products_AddProductStonePage epapstonePage = new Ecommerce_Products_AddProductStonePage(driver);
		epapstonePage.getStoneNameEdt().sendKeys(AddProductStoneName);
		Thread.sleep(2000);
		epapstonePage.getAddBtn().click();
		Thread.sleep(1000);
		WebElement PleaseEnterColourError = driver.findElement(By.xpath("(//div[.=' Please Enter Colour '])[2]"));
		Thread.sleep(1000);
		if(PleaseEnterColourError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z1b_Adding Product Stone By Giving Only Stone Name Error");
		}
		else
		{
			System.out.println("Product Stone Added Successfully");
		}
		Thread.sleep(4000);
		epapstonePage.getStoneColourEdt().sendKeys(AddProductStoneColour);
		Thread.sleep(2000);
		epapstonePage.getAddBtn().click();
		Thread.sleep(1000);
		WebElement PleaseEnterPriceError = driver.findElement(By.xpath("(//div[.=' Please Enter Stone Price '])[2]"));
		Thread.sleep(1000);
		if(PleaseEnterPriceError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z1c_Adding Product Stone By Giving Only Stone Name,Colour Error");
		}
		else
		{
			System.out.println("Product Stone Added Successfully");
		}
		Thread.sleep(4000);
		epapstonePage.getStonePriceEdt().sendKeys(AddProductStonePrice);
		Thread.sleep(2000);
		epapstonePage.getAddBtn().click();
		Thread.sleep(1000);
		WebElement PleaseEnterNoOfStonesError = driver.findElement(By.xpath("(//div[.=' Please Enter No Of Stones '])[2]"));
		Thread.sleep(1000);
		if(PleaseEnterNoOfStonesError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z1d_Adding Product Stone By Giving Only Stone Name,Colour,Price Error");
		}
		else
		{
			System.out.println("Product Stone Added Successfully");
		}
		Thread.sleep(4000);
		epapstonePage.getNoOfStonesEdt().sendKeys(AddProductNoOfStones);
		Thread.sleep(2000);
		epapstonePage.getAddBtn().click();
		Thread.sleep(1000);
		WebElement StoneAddedSuccessMsg = driver.findElement(By.xpath("(//div[.=' Product Stone Added Successfully '])[2]"));
		Thread.sleep(1000);
		if(StoneAddedSuccessMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z1e_Adding Product Stone By Giving Only Stone Name,Colour,Price.NoofStones Success Error Colour field is Accepting Special Chars");
		}
		else
		{
			System.out.println("Product Stone Not Added Successfully");
		}
		Thread.sleep(2000);    
	    
		
		eppstonePage.getSearchEdt().sendKeys(ProductStoneSearchValue);
		Thread.sleep(1000);
		WebElement AddStoneNoRecordsError = driver.findElement(By.xpath("//h5[.='No records found']"));
		Thread.sleep(1000);
		if(AddStoneNoRecordsError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z1f_Searched Invalid Stone, Should Not Display Error");
		}
		else
		{
			System.out.println("Searched value is Displayed");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		eppstonePage.getEditBtn().click();
		Thread.sleep(2000);
		WebElement UpdateProductStonePage = driver.findElement(By.xpath("//h1[.='Update Product Stone']"));
		Thread.sleep(1000);
		if(UpdateProductStonePage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z1g_Clicking On Edit Button Update Product Page Should Not Display Error");
		}
		else
		{
			System.out.println("Update Product Page Is Not Displayed");
		}
		Thread.sleep(1000);
		Ecommerce_UpdateProductStonePage eupstonePage = new Ecommerce_UpdateProductStonePage(driver);
		eupstonePage.getStoneNameEdt().clear();
		Thread.sleep(2000);
		eupstonePage.getUpdateBtn().click();
		Thread.sleep(1000);
		WebElement ClearingStoneNameSuccessMsg = driver.findElement(By.xpath("(//div[.='  Product Stone Updated Successfully '])[2]"));
		Thread.sleep(1000);
		if (ClearingStoneNameSuccessMsg.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "z1h_Clearing Stone Name While Updating Stone Name Success Error");
		} 
		else
		{
			System.out.println("Product Stone Updated Successfully");
		}
		Thread.sleep(4000);
		eppstonePage.getEditBtn().click();
		Thread.sleep(2000);
		eupstonePage.getStoneColourEdt().clear();
		Thread.sleep(2000);
		eupstonePage.getUpdateBtn().click();
		Thread.sleep(1000);
		WebElement ClearingStoneColourSuccessMsg = driver.findElement(By.xpath("(//div[.='  Product Stone Updated Successfully '])[2]"));
		Thread.sleep(1000);
		if (ClearingStoneColourSuccessMsg.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "z1i_Clearing Stone Colour While Updating Stone Name Success Error");
		} 
		else
		{
			System.out.println("Product Stone Updated Successfully");
		}
		Thread.sleep(4000);
		eppstonePage.getEditBtn().click();
		Thread.sleep(2000);
		eupstonePage.getStonePriceEdt().clear();
		Thread.sleep(2000);
		eupstonePage.getUpdateBtn().click();
		Thread.sleep(1000);
		try 
		{
			WebElement ClearingStonePriceSuccessMsg = driver.findElement(By.xpath("(//div[.='  Product Stone Updated Successfully '])[2]"));
			Thread.sleep(1000);
			if (ClearingStonePriceSuccessMsg.isDisplayed()) 
			{
				wUtil.takeScreenShot(driver, "z1j_Clearing Stone Price While Updating Stone Name Success Error");
			} 
			else
			{
				System.out.println("Product Stone Updated Successfully");
			}
		} 
		catch (Exception e) 
		{
			wUtil.takeScreenShot(driver, "z1j_Clearing Stone Price While Updating Stone Name Success Error");
		}
		
		Thread.sleep(4000);
		eppstonePage.getEditBtn().click();
		Thread.sleep(2000);
		eupstonePage.getNoOfStonesEdt().clear();
		Thread.sleep(2000);
		eupstonePage.getUpdateBtn().click();
		Thread.sleep(1000);
		WebElement ClearingNoOfStonesSuccessMsg = driver.findElement(By.xpath("(//div[.='  Product Stone Updated Successfully '])[2]"));
		Thread.sleep(1000);
		if (ClearingNoOfStonesSuccessMsg.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "z1k_Clearing No Of Stones While Updating Stone Name Success Error");
		}
		else
		{
			System.out.println("Product Stone Updated Successfully");
		}
		Thread.sleep(4000);
		eppstonePage.getBootstrapBtn().click();
		WebElement ClickOnBootstrapBtnUpdateSuccess = driver.findElement(By.xpath("(//div[.='  Product Stone Updated Successfully '])[2]"));
		Thread.sleep(1000);
		if (ClickOnBootstrapBtnUpdateSuccess.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "z1l_Clicking BootstrapBtn Product Stone Should Not Update Successfully Error");
		}
		else
		{
			System.out.println("Product Stone Updated Successfully");
		}
		Thread.sleep(4000);
		eppstonePage.getDeleteBtn().click();
		WebElement ClickOnDeleteSuccess = driver.findElement(By.xpath("(//div[.=' Successfully Deleted '])[2]"));
		Thread.sleep(1000);
		if (ClickOnDeleteSuccess.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "z1m_Clicking Delete Product Stone Should Not Delete Successfully Error");
		}
		else
		{
			System.out.println("Product Stone Deleted Successfully");
		}
		Thread.sleep(4000);
		dbPage.getEcommerceDrpDwn().click();
		Thread.sleep(2000);		
		ePage.getProductsLnk().click();
		Thread.sleep(2000);
		eplPage.getDescriptionViewBtn().click();
		Thread.sleep(2000);
		Ecommerce_Product_DescriptionPage epdPage = new Ecommerce_Product_DescriptionPage(driver);
		epdPage.getUnderstandBtn().click();
		Thread.sleep(2000);
		eplPage.getActionEditBtn().click();
		Thread.sleep(2000);
		WebElement UpdateProductDetailsPage = driver.findElement(By.xpath("//h1[.='Update Product Details']"));
		if(UpdateProductDetailsPage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z1n_Clicking On Edit Button Update Product Details Page Should Not Open");
		}
		else
		{
			System.out.println("Update Product Details Page is Not Opened");
		}
		Thread.sleep(2000);
		Ecommerce_UpdateProductDetailsPage eupdPage = new Ecommerce_UpdateProductDetailsPage(driver);
		Select s = new Select(eupdPage.getCategoryDrpDwn());
		s.selectByVisibleText("Select Category");
		Thread.sleep(2000);
		eupdPage.getUpdateBtn().click();
		Thread.sleep(1000);
		WebElement ClearingCategoryError = driver.findElement(By.xpath("(//div[.=' Invalid form details '])[2]"));
		if(ClearingCategoryError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z1o_Clearing Category While Updating Product Details Error");
		}
		else
		{
			System.out.println("Product Updated Successfully");
		}
		Select s7 = new Select(eupdPage.getSubCategoryDrpDwn());
		s7.selectByVisibleText("Select SubCategory");
		Thread.sleep(2000);
		eupdPage.getUpdateBtn().click();
		Thread.sleep(1000);
		WebElement ClearingSubCategoryError = driver.findElement(By.xpath("(//div[.=' Invalid form details '])[2]"));
		if(ClearingSubCategoryError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z1p_Clearing Sub Category While Updating Product Details Error");
		}
		else
		{
			System.out.println("Product Updated Successfully");
		}
		Select s8 = new Select(eupdPage.getBrandNameDrpDwn());
		s8.selectByVisibleText("Select Brand");
		Thread.sleep(2000);
		eupdPage.getUpdateBtn().click();
		Thread.sleep(1000);
		WebElement ClearingBrandError = driver.findElement(By.xpath("(//div[.=' Invalid form details '])[2]"));
		if(ClearingBrandError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z1q_Clearing Brand While Updating Product Details Error");
		}
		else
		{
			System.out.println("Product Updated Successfully");
		}
		Thread.sleep(2000);
		eupdPage.getProductNameEdt().clear();
		Thread.sleep(1000);
		eupdPage.getUpdateBtn().click();
		Thread.sleep(1000);
		WebElement ClearingProductNameError = driver.findElement(By.xpath("(//div[.=' Invalid form details '])[2]"));
		if(ClearingProductNameError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z1r_Clearing Product Name While Updating Product Details Error");
		}
		else
		{
			System.out.println("Product Updated Successfully");
		}
		Thread.sleep(2000);
		eupdPage.getVaEdt().clear();
		Thread.sleep(1000);
		eupdPage.getUpdateBtn().click();
		Thread.sleep(1000);
		WebElement ClearingVaPercentError = driver.findElement(By.xpath("(//div[.=' Invalid form details '])[2]"));
		if(ClearingVaPercentError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z1s_Clearing Va % While Updating Product Details Error");
		}
		else
		{
			System.out.println("Product Updated Successfully");
		}
		Select s9 = new Select(eupdPage.getCaratDrpDwn());
		s9.selectByVisibleText("Select Carat");
		Thread.sleep(2000);
		eupdPage.getUpdateBtn().click();
		Thread.sleep(1000);
		WebElement ClearingCaratError = driver.findElement(By.xpath("(//div[.=' Invalid form details '])[2]"));
		if(ClearingCaratError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z1t_Clearing Carat While Updating Product Details Error");
		}
		else
		{
			System.out.println("Product Updated Successfully");
		}
		Select s10 = new Select(eupdPage.getTypeDrpDwn());
		s10.selectByVisibleText("Select Type");
		Thread.sleep(2000);
		eupdPage.getUpdateBtn().click();
		Thread.sleep(1000);
		WebElement ClearingTypeError = driver.findElement(By.xpath("(//div[.=' Invalid form details '])[2]"));
		if(ClearingTypeError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z1u_Clearing Type While Updating Product Details Error");
		}
		else
		{
			System.out.println("Product Updated Successfully");
		}
		Select s11 = new Select(eupdPage.getIsShownDrpDwn());
		s11.selectByVisibleText("Select Type");
		Thread.sleep(2000);
		eupdPage.getUpdateBtn().click();
		Thread.sleep(1000);
		WebElement ClearingIsShownError = driver.findElement(By.xpath("(//div[.=' Invalid form details '])[2]"));
		if(ClearingIsShownError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z1v_Clearing Is Shown While Updating Product Details Error");
		}
		else
		{
			System.out.println("Product Updated Successfully");
		}
		Thread.sleep(2000);
		eupdPage.getPriceEdt().clear();
		Thread.sleep(1000);
		eupdPage.getUpdateBtn().click();
		Thread.sleep(1000);
		WebElement ClearingPriceError = driver.findElement(By.xpath("(//div[.=' Invalid form details '])[2]"));
		if(ClearingPriceError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z1w_Clearing Price While Updating Product Details Error");
		}
		else
		{
			System.out.println("Product Updated Successfully");
		}
		Thread.sleep(2000);
		eupdPage.getDescriptionEdt().clear();
		Thread.sleep(1000);
		eupdPage.getUpdateBtn().click();
		Thread.sleep(1000);
		WebElement ClearingDescriptionError = driver.findElement(By.xpath("(//div[.=' Invalid form details '])[2]"));
		if(ClearingDescriptionError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z1x_Clearing Description While Updating Product Details Error");
		}
		else
		{
			System.out.println("Product Updated Successfully");
		}
		Thread.sleep(2000);
		eupdPage.getCloseBtn().click();
		Thread.sleep(1000);
		if(UpdateProductDetailsPage.isDisplayed())
		{
			System.out.println("Update Product Details Page Not Closed");
		}
		else
		{
			wUtil.takeScreenShot(driver, "z1y_Clicking On Close Button Update Product Details Page Should Not Close Error");
		}
		Thread.sleep(2000);
		eplPage.getActionEnableDisableBootStrapBtn().click();
		Thread.sleep(1000);
		WebElement UpdateMsg = driver.findElement(By.xpath("(//div[.=' Product Details Updated Successfully '])[2]"));
		if(UpdateMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z1z_Clicking On Bootstrap Button Product Should Not Update Error");
		}
		else
		{
			System.out.println("Product Updated Successfully");
		}
		Thread.sleep(2000);
		eplPage.getDeleteBtn().click();
		Thread.sleep(1000);
		WebElement ProductDeleteMsg = driver.findElement(By.xpath("(//div[.=' Successfully Deleted '])[2]"));
		if(ProductDeleteMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "z2a_Clicking On Delete Button Product Should Not Delete Error");
		}
		else
		{
			System.out.println("Product Deleted Successfully");
		}
		
	}
	
	
	
	
	@Test
	public void brandsAllActionsTest() throws Exception
	{
		String BrandSearchValue = eUtil.readDataFromExcel("Sprint-5 Negative", 45, 1);
		String AddBrandExistingBrandName = eUtil.readDataFromExcel("Sprint-5 Negative", 45, 3);
		String AddBrandNewBrandName = eUtil.readDataFromExcel("Sprint-5 Negative", 45, 5)+jUtil.getRandomNum();
//		String UpdateBrandName = eUtil.readDataFromExcel("Sprint-5 Negative", 46, 3);
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		
		Thread.sleep(2000);
		DashboardPage dPage = new DashboardPage(driver);
		dPage.getEcommerceDrpDwn().click();
		Thread.sleep(1000);
		EcommercePage ePage = new EcommercePage(driver);
		ePage.getBrandsLnk().click();
		Ecommerce_BrandsPage ebPage = new Ecommerce_BrandsPage(driver);
		ebPage.getSearchEdt().sendKeys(BrandSearchValue);
		Thread.sleep(2000);
		WebElement NoRecordsError = driver.findElement(By.xpath("//h5[.='No records found']"));
		if(NoRecordsError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "a_Searching Invalid Brand Error");
		}
		else
		{
			System.out.println("Searched Brand Displayed");
		}
		Thread.sleep(2000);
		ebPage.getSearchEdt().clear();
		Thread.sleep(2000);
		ebPage.getAddBrandBtn().click();
		Thread.sleep(2000);
		WebElement AddBrandPage = driver.findElement(By.xpath("//h1[.='Add Brand']"));
		Thread.sleep(1000);
		if(AddBrandPage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "b_Clicking On Add Brand Button Add Brand Page Should Not Display Error");
		}
		else
		{
			System.out.println("Add Brand Page Not Displayed");
		}
		Ecommerce_Brands_AddBrandPage ebabPage = new Ecommerce_Brands_AddBrandPage(driver);
		ebabPage.getBrandNameEdt().sendKeys(AddBrandExistingBrandName);
		Thread.sleep(2000);
		ebabPage.getAddBtn().click();
		Thread.sleep(1000);
		WebElement AllFieldsRequiredError = driver.findElement(By.xpath("(//div[.=' All fields are required '])[2]"));
		if(AllFieldsRequiredError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "c_Adding Brand By Giving Only Brand Name Error");
		}
		else
		{
			System.out.println("Brand Added Successfully");
		}
		Thread.sleep(4000);
		ebabPage.getChooseFileBtn().sendKeys(ImagePath);
		Thread.sleep(1000);
		ebabPage.getAddBtn().click();
		WebElement BrandNameAlreadyExistError = driver.findElement(By.xpath("(//div[.=' Brand Name is Already Existed '])[2]"));
		if(BrandNameAlreadyExistError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "d_Adding Brand By Giving Already Existing Brand Name Error");
		}
		else
		{
			System.out.println("Brand Added Successfully");
		}
		Thread.sleep(4000);
		ebabPage.getBrandNameEdt().clear();
		Thread.sleep(1000);
		ebabPage.getBrandNameEdt().sendKeys(AddBrandNewBrandName);
		Thread.sleep(2000);
		ebabPage.getAddBtn().click();
		Thread.sleep(1000);
		WebElement BrandCreatedSuccessfullyMsg = driver.findElement(By.xpath("(//div[.=' Brand Craeted Successfully '])[2]"));
		if(BrandCreatedSuccessfullyMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "e_Adding Brand By Giving All Valid Data Success Msg");
		}
		else
		{
			System.out.println("Brand Not Added");
		}
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		ebPage.clickOnParticularBrandEditBtn(driver, AddBrandNewBrandName);
		Thread.sleep(1000);
		WebElement UpdateBrandPage = driver.findElement(By.xpath("//h1[.='Update Brand']"));
		if(UpdateBrandPage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "f_Clicking On Edit Button Update Brand Page Should Not Display Error");
		}
		else
		{
			System.out.println("Update Brand Page Displayed");
		}
		Thread.sleep(2000);
		Ecommerce_Brands_UpdateBrandPage ebubPage = new Ecommerce_Brands_UpdateBrandPage(driver);
		ebubPage.getBrandNameEdt().clear();
		Thread.sleep(2000);
		ebubPage.getUpdateBtn().click();
		Thread.sleep(1000);
		WebElement ClearingBrandNameSuccessMsg = driver.findElement(By.xpath("(//div[.=' Brand Updated Successfully '])[2]"));
		if(ClearingBrandNameSuccessMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "g_Clearing Brand Name Brand Updated Successfully Error");
		}
		else
		{
			System.out.println("Brand Not Updated");
		}
		Thread.sleep(4000);
		ebPage.clickOnParticularBrandEditBtn(driver, AddBrandNewBrandName);
		Thread.sleep(1000);
		ebubPage.getBrandNameEdt().clear();
		Thread.sleep(2000);
		ebubPage.getChooseFileBtn().clear();
		Thread.sleep(2000);
		ebubPage.getUpdateBtn().click();
		Thread.sleep(1000);
		WebElement UpdateSuccessMsg = driver.findElement(By.xpath("(//div[.=' Brand Updated Successfully '])[2]"));
		if(UpdateSuccessMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "h_Clearing Brand Name Brand Updated Successfully Error");
		}
		else
		{
			System.out.println("Brand Not Updated");
		}
		Thread.sleep(1000);
		ebPage.clickOnParticularBrandBootStrapBtnToDisable(driver, AddBrandNewBrandName);
		Thread.sleep(2000);
		WebElement BootstrapUpdateMsg = driver.findElement(By.xpath("(//div[.=' Brand Updated Successfully '])[2]"));
		if(BootstrapUpdateMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "i_Clicking On Bootstrap Button Brand Should Not Update Error");
		}
		else
		{
			System.out.println("Brand Not Updated");
		}
		Thread.sleep(2000);
		ebPage.clickOnParticularBrandDeleteBtn(driver, AddBrandNewBrandName);
		Thread.sleep(1000);
		WebElement DeleteMsg = driver.findElement(By.xpath("(//div[.=' Successfully Deleted '])[2]"));
		if(DeleteMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "j_Clicking On Delete Btn Brand Should Not Delete Error");
		}
		else
		{
			System.out.println("Brand Not Deleted");
		}
		
	}
	
	@Test
	public void ecommerce_Orders_NegativeTest () throws Exception
	{
		String CategorySearchValue = eUtility.readDataFromExcel("Sprint-5-Categ&Sub-Negative", 20, 1);
        String StartDate = eUtility.readDataFromExcel("Sprint-5-Categ&Sub-Negative", 20, 1);
        String EndDate = eUtility.readDataFromExcel("Sprint-5-Categ&Sub-Negative", 21, 1);
        String SelectOrderStatus = eUtility.readDataFromExcel("Sprint-5-Categ&Sub-Negative", 22, 1);
        String MobileNumber = eUtility.readDataFromExcel("Sprint-5-Categ&Sub-Negative", 23, 1);
        
        //1
        
        Thread.sleep(2000);
        DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getEcommerceDrpDwn().click();
		Thread.sleep(2000);
		EcommercePage ePage = new EcommercePage(driver);
		ePage.getEcommerceOrdersLnk().click();
		Thread.sleep(2000);
		Ecommerce_EcommerceOrdersPage eoPage = new Ecommerce_EcommerceOrdersPage(driver);
		eoPage.getSearchEdt().sendKeys(CategorySearchValue);
		Thread.sleep(2000);
		WebElement OrdersNoRecordsError = driver.findElement(By.xpath("//h5[.='No records found']"));
		Thread.sleep(1000);
		if (OrdersNoRecordsError.isDisplayed())
		{
			wUtility.takeScreenShot(driver, "a_Searched Invalid Category Error");
		}
		else 
		{
            System.out.println("Searched Category Found");
		}
		Thread.sleep(2000);
		
		//2
		
		eoPage.getSearchEdt().clear();
		
        Thread.sleep(2000);
		
		eoPage.getFilterBtn().click();
		
		Ecommerce_EcommerceOrders_FilterPage eeoPage = new Ecommerce_EcommerceOrders_FilterPage(driver);
		
		eeoPage.getStartDateEdt().sendKeys(StartDate);
		
		Thread.sleep(2000);
		
		eeoPage.getEndDateEdt().sendKeys(EndDate);
		
		eeoPage.getSearchBtn().click();
		
         WebElement FilterError = driver.findElement(By.xpath("//h5[.='No records found']"));
		
		Thread.sleep(2000);
		
		if (FilterError.isDisplayed())
		{
			wUtility.takeScreenShot(driver, "b_No Results Found");
		} 
		else 
		{
            System.out.println("Results Found");
		}
		Thread.sleep(6000);
	
		//3
		
		eeoPage.getMobileNumberEdt().sendKeys(MobileNumber);
		
		eeoPage.getSearchBtn().click();
		
        WebElement MobileNumberError = driver.findElement(By.xpath("//div[@aria-label='No results found']"));
		
		Thread.sleep(2000);
		
		if (MobileNumberError.isDisplayed()) 
		{
			wUtility.takeScreenShot(driver, "c_No Results Found");
		} 
		else 
		{
            System.out.println("Results Found");
		}
		Thread.sleep(6000);
	
		//4
		
		eeoPage.getSelectOrderStatusDrpDwn().click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		eeoPage.getSearchBtn().click();
		
        WebElement ErrorFounded = driver.findElement(By.xpath("//div[@aria-label='No results found']"));
		
		Thread.sleep(2000);
		
		if (ErrorFounded.isDisplayed()) 
		{
			wUtility.takeScreenShot(driver, "d_Results Not Found");
		} 
		else 
		{
            System.out.println("Results Found");
		}
		Thread.sleep(4000);
			
	}
	
	@Test
	public void ECommerce_Transactions_NegativeTest() throws Exception
	{
		String CategorySearchValue = eUtility.readDataFromExcel("Sprint-5-Categ&Sub-Negative", 26, 1);
		
//      String StartDate = eUtility.readDataFromExcel("Sprint-5-Categ&Sub-Negative", 27, 1);
//      String EndDate = eUtility.readDataFromExcel("Sprint-5-Categ&Sub-Negative", 28, 1);
//		String SelectTxnType = eUtility.readDataFromExcel("Sprint-5-Categ&Sub-Negative", 29, 1);
//		String SelectType = eUtility.readDataFromExcel("Sprint-5-Categ&Sub-Negative", 30, 1);
//		String MobileNumber = eUtility.readDataFromExcel("Sprint-5-Categ&Sub-Negative", 31, 1);
//		String TransactionID = eUtility.readDataFromExcel("Sprint-5-Categ&Sub-Negative", 32, 1);
		
        Thread.sleep(2000);
        
        DashboardPage dbPage = new DashboardPage(driver);
	
		dbPage.getEcommerceDrpDwn().click();
		
		EcommercePage ePage = new EcommercePage(driver);
		
		ePage.getEcomTransactionsLnk().click();
		
		Ecommerce_Ecom_TransactionsPage etPage = new Ecommerce_Ecom_TransactionsPage(driver);
		
		etPage.getSearchEdt().sendKeys(CategorySearchValue);
		
        Thread.sleep(2000);
		
		WebElement EcomTransactions = driver.findElement(By.xpath("//h4[.='Ecommerce Transactions']"));
		
		Thread.sleep(2000);
		
		if (EcomTransactions.isDisplayed()) 
		{
			wUtility.takeScreenShot(driver, "a_EcomTransactions Error");
		} 
		else 
		{
            System.out.println("Searched Category Found");
		}
		Thread.sleep(4000);
	
	}
	
	
	
}





