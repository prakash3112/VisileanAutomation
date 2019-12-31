set projectLocation=C:\Users\Visilean\git\VisileanAutomation\VisileanAutomation
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause