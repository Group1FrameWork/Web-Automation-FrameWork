<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Walgreen API Automation Script " parallel="false">

    <parameter name="useCloudEnv" value="false"/>
    <parameter name="cloudEnvName" value="browserstack"/>
    <parameter name="os" value="OS X"/>
    <parameter name="os_version" value="high Sierra"/>
    <parameter name="browserName" value="chrome"/>
    <parameter name="browserVersion" value="60.0"/>
    <parameter name="url" value="https://www.Amazon.com"/>


    <test name="Search Items">
        <parameter name="browserName" value="chrome"/>

        <classes>
            <class name="Home.TestAmazonhome"/>
            <class name="Home.TestamazonHomepage"/>
            <class name="search.TestDropDownMenuSearch"/>
            <class name="search.TestSearchItems"/>
        </classes>
    </test>


</suite>