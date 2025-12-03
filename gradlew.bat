@echo off
setlocal

set DIRNAME=%~dp0
set APP_BASE_NAME=%~n0

"%JAVA_HOME%\bin\java.exe" -jar "%DIRNAME%gradle\wrapper\gradle-wrapper.jar" %*
