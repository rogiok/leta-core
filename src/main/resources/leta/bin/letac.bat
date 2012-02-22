@echo off
set ERROR_CODE=0

if not "%LETA_HOME%"=="" goto runLeta

echo.
echo ERROR: LETA_HOME not found in your environment.
echo Please set the LETA_HOME variable in your environment to match the
echo location of the Leta installation
echo.
goto error

:runLeta

@REM -- Regular WinNT shell
set LETA_CMD_LINE_ARGS=%*
goto endInit

@REM The 4NT Shell from jp software
:4NTArgs
set LETA_CMD_LINE_ARGS=%$
goto endInit

:Win9xArg
@REM Slurp the command line arguments.  This loop allows for an unlimited number
@REM of agruments (up to the command line limit, anyway).
set LETA_CMD_LINE_ARGS=
:Win9xApp
if %1a==a goto endInit
set LETA_CMD_LINE_ARGS=%LETA_CMD_LINE_ARGS% %1
shift
goto Win9xApp

:endInit

java -classpath %LETA_HOME%/lib/antlr-3.3.jar;%LETA_HOME%/lib/antlr-runtime-3.3.jar;%LETA_HOME%/lib/stringtemplate-3.2.1.jar;%LETA_HOME%/lib/antlr-2.7.7.jar;%LETA_HOME%/lib/leta-core-0.6.0-SNAPSHOT.jar leta.core.Generator %LETA_CMD_LINE_ARGS%

:error
set ERROR_CODE=1
