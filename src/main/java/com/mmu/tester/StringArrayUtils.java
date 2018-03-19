package uk.ac.mmu.scmdt.dtsda.lab12;

public class StringArrayUtils
{  
  //pre  - stringArray is a non-null array of Strings with no null elements
  //post - returns the total length of all the strings added together
  public static int getTotalLength(String [] stringArray)
  {
    //totalLength - used to record the sum of the lengths of all strings 
    int totalLength = 0;
    
    //look at each string and add its length to the running total
    for(int i = 0; i < stringArray.length; i++)
    {
      totalLength += stringArray[i].length();
    }//for i
    
    //return the total length of all strings
    return totalLength;
  }//method - getTotalLength
  
  //pre  - stringArray is a non-null array of Strings with no null elements
  //post - returns the length of the longest string
  public static int getMaxLength(String [] stringArray)
  {
    //set maxLengthString as an initial value
    int maxLengthString = 0;
    
    //check every string to see if it is shorter than the initial value
    for(int i = 1; i < stringArray.length; i++)
    {
      String string = stringArray[i];
      if(string.length() > maxLengthString)
      {
        //update maxLengthString when a longer string is found
        maxLengthString = string.length();
      }//if
    }//for string
    
    //return the length of the longest string
    return maxLengthString;
  }//method - getMaxLength
  
  //pre  - stringArray is a non-null array of Strings with no null elements
  //post - returns the length of the shortest string
  public static int getMinLength(String [] stringArray)
  {
    //set minLengthString as an initial value
    int minLengthString = 10;
    
    //check every string to see if it is shorter than the initial value
    for(String string : stringArray)
    {
      if(string.length() < minLengthString)
      {
        //update minLengthString when a shorter string is found
        minLengthString = string.length();
      }//if
    }//for
    
    //return the length of the shortest string that was found
    return minLengthString;
  }//method - getMinLength

  //pre  - string array is a non-null array of strings
  //post - returns all of the strings in stringArray added together
  public static String implode(String [] stringArray)
  {
    //stringToReturn should begin as the empty string ""
    String stringToReturn = "";
    
    //step through each string and concatenate it to the end of stringToReturn
    for(String string : stringArray)
    {
      stringToReturn = stringToReturn + string;
    }//for
    
    //return the imploded string
    return stringToReturn;
  }//method - implode
  
  //pre  - string is the non-null string to be exploded
  //     - width is the number of chars to return in each substring
  //         must be greater than 0 and less than string.length();
  //post - the exploded string - will return null if width is out of bounds
  public static String [] explode(String string, int width)
  {
    //the array that we will populate with the exploded string
    String [] stringArray;
    
    //check whether width has a sensible value (i.e., between 0 and the 
    // length of the string)
    if(width <= 0 || width > string.length())
    {
      //if width is out of bounds
      stringArray = null;
    }//if
    else
    {
      //if the width is in bounds we explode the string
      
      //we can calculate the number of elements in the array as follows:
      int arrayLength = string.length() / width;
      
      //then create the new String array
      stringArray = new String[arrayLength];
      
      //the begin and end indices of each substring - the first substring will 
      // start at 0 and end at 'width'.
      int substringBegin = 0;
      int substringEnd = width;
      
      //the index of the current element in the array
      int index = 0;
      
      //the while loop will continue until the substringBegin is after the end 
      // of the array
      while(substringBegin < string.length())
      {
        //assign the next index in the array to be the substring denoted 
        // by begin and end
        stringArray[index] = string.substring(substringBegin, substringEnd);
        
        //increment the index for next time
        index++;
        
        //update begin and end by incrementing both by 'width'
        substringBegin = substringBegin + width;
        substringEnd = substringEnd + width;
      }//while
    }//else
    
    //return the exploded array of Strings
    return stringArray;
  }//method - explode
}//class - String ArrayUtils
