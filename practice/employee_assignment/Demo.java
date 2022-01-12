//package practice.employee_assignment;
//
//public class Demo {
//    class employee
//    {
//
//        private int id,sal;
//        private String name,dept;
//
//        employee()
//        {
//
//            System.out.println("\nObject  Has Constructed : ");
//
//        }
//
//        employee(int i,int s,String n,String d)
//        {
//
//            id=i;
//            sal=s;
//            name=n;
//            dept=d;
//
//        }
//
//        void accept()
//        {
//
//            try
//            {
//
//                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//
//                System.out.print("\n\nName : ");
//                name=br.readLine();
//
//                System.out.print("\n\nId : ");
//                id=Integer.parseInt(br.readLine());
//
//                System.out.print("\n\nSalary : ");
//                sal=Integer.parseInt(br.readLine());
//
//                System.out.print("\n\nDepartment : ");
//                dept =br.readLine();
//
//            }
//
//            catch(Exception e)
//            {
//
//                System.out.println(e);
//
//            }
//
//        }
//
//        void display()
//        {
//
//            System.out.println("\n Id \t Name \t Salary \t Department ");
//            System.out.println("\n "+id+" \t "+name+" \t "+sal+" \t "+dept);
//
//        }
//
//        int getid()
//        {
//
//            return(id);
//
//        }
//
//        int getsal()
//        {
//
//            return(sal);
//
//        }
//
//        String getname()
//        {
//
//            return(name);
//
//        }
//
//        String getdept()
//        {
//
//            return(dept);
//
//        }
//
//    }
//
//
//    class manager extends employee
//    {
//
//        private int bonus;
//
//        manager()
//        {
//
//            super();
//
//        }
//
//        manager(int i,int s,String n,String d,int b)
//        {
//
//            super(i,s,n,d);
//
//            bonus=b;
//
//        }
//
//        void accept()
//        {
//
//            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//
//            try
//            {
//
//                super.accept();
//
//                System.out.print("\nBonus : ");
//                bonus=Integer.parseInt(br.readLine());
//
//            }
//
//            catch(Exception e)
//            {
//
//                System.out.println(e);
//
//            }
//
//        }
//
//        void display()
//        {
//
//            super.display();
//
//            System.out.println("\nBonus : "+bonus);
//
//        }
//
//        static void max(manager m1[])
//        {
//
//            int max=0,total=0,id=0;
//
//            for(int i=0;i<m1.length;i++)
//            {
//
//                total=(m1[i].getsal())+m1[i].bonus;
//
//                if(max<total)
//                {
//
//                    max=total;
//
//                    id=i;
//
//                }
//
//            }
//
//            System.out.println("\n\nMaximum Salary Employee : ");
//            m1[id].display();
//
//        }
//
//    }
//
//    class ass3a1
//    {
//
//        public static void  main(String args[])
//        {
//
//            try
//            {
//
//                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//
//                System.out.print("\nEnter The No Of Employees : ");
//                int n=Integer.parseInt(br.readLine());
//
//                manager[]m= new manager[n];
//
//                System.out.println("\nEnter The Data : ");
//
//                for(int i=0;i<n;i++)
//                {
//
//                    m[i]=new manager();
//                    m[i].accept();
//
//                }
//                manager.max(m);
//
//            }
//
//            catch(Exception e)
//            {
//
//                System.out.println(e);
//
//            }
//
//        }
//
//    }
//}
