//idega 2000 - �gir og eiki

package com.idega.block.news.data;

//import java.util.*;
import java.sql.*;
//import com.idega.data.*;
import com.idega.data.*;
// Changed by Aron
public class NewsCategory extends GenericEntity{

  public NewsCategory(){
          super();
  }
  public NewsCategory(int id)throws SQLException{
          super(id);
  }
  public void initializeAttributes(){
    addAttribute(getIDColumnName());
    addAttribute(getNameColumnName(), "Name", true, true, String.class);
    addAttribute(getDescriptionColumnName(), "Description", true, true, String.class);
    addAttribute(getNewsDateColumnName(), "News date", true, true, java.sql.Date.class);
    addAttribute(getValidColumnName(), "Valid", true, true, String.class,1);
  }

  public void insertStartData()throws Exception{
    NewsCategory cat = new NewsCategory();
    cat.setName("Default");
    cat.setValid("Y");
    cat.setDescription("Default Category for idegaWeb");
    cat.insert();

  }

  public static String getNewsCategoryTableName(){return "NW_NEWS_CAT";}
  public static String getNameColumnName(){return "NAME";}
  public static String getDescriptionColumnName(){return "DESCRIPTION";}
  public static String getValidColumnName(){return "VALID";}
  public static String getNewsDateColumnName(){return "NEWS_DATE";}

  public String getEntityName(){
    return getNewsCategoryTableName();
  }
  public String getName(){
    return getNewsCategoryName();
  }
  public String getNewsCategoryName(){
    return getStringColumnValue(getNameColumnName());
  }

  public void setName(String name){
    setNewsCategoryName(name);
  }

  public void setNewsCategoryName(String news_category_name){
    setColumn(getNameColumnName(), news_category_name);
  }
  public String getDescription(){
    return getStringColumnValue(getDescriptionColumnName());
  }
  public void setDescription(String description){
    setColumn(getDescriptionColumnName(), description);
  }
  public String getValid(){
    return getStringColumnValue(getValidColumnName());
  }
  public void setValid(String valid){
    setColumn(getValidColumnName(), valid);
  }
  public java.sql.Date getDate(){
    return (java.sql.Date) getColumnValue(getNewsDateColumnName());
  }
  public void setDate(java.sql.Date NEWS_CATEGORY_DATE){
    setColumn(getNewsDateColumnName(), NEWS_CATEGORY_DATE);
  }
}
