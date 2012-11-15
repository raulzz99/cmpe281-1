/*
 * JBoss, Home of Professional Open Source
 * Copyright 2005, JBoss Inc., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

public class Driver
{
   public static void main(String[] args) throws Exception
   {
      POJO pojo = new POJO();
      
      System.out.println("\nCalling POJO->throwPOJOExceptionMethod()");
      System.out.println("====================================");
      try
      {
         pojo.throwPOJOExceptionMethod("argument");
      }
      catch (Exception exception)
      {
         System.out.println("Catching Exception " + exception);
      }
      
      System.out.println("\nCalling POJO->throwRuntimeExceptionMethod()");
      System.out.println("====================================");
      try
      {
         pojo.throwRuntimeExceptionMethod("argument");
      }
      catch (Exception exception)
      {
         System.out.println("Catching Exception " + exception);
      }
      
      System.out.println("\nCalling POJO->throwNullPointerExceptionMethod()");
      System.out.println("====================================");
      try
      {
         pojo.throwNullPointerExceptionMethod("argument");
      }
      catch (Exception exception)
      {
         System.out.println("Catching Exception " + exception);
      }
      
      System.out.println("\nCalling POJO->throwNothingMethod()");
      System.out.println("==================================");
      pojo.throwNothingMethod();
      System.out.println("No Exception this time");
   }
}