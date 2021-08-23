$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:feature/EbayAdvancedSearch.feature");
formatter.feature({
  "name": "Ebay Advanced Search Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Advanced Search of an item",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@P25"
    }
  ]
});
formatter.before({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 80\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DELL-5559\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x010D0AE3+1706723]\n\tOrdinal0 [0x010368C1+1075393]\n\tOrdinal0 [0x00FADFA9+516009]\n\tOrdinal0 [0x00F40554+66900]\n\tOrdinal0 [0x00F3CCE2+52450]\n\tOrdinal0 [0x00F5BFD7+180183]\n\tOrdinal0 [0x00F5BDDD+179677]\n\tOrdinal0 [0x00F59D4B+171339]\n\tOrdinal0 [0x00F41D4A+73034]\n\tOrdinal0 [0x00F42DC0+77248]\n\tOrdinal0 [0x00F42D59+77145]\n\tOrdinal0 [0x0104BB37+1162039]\n\tGetHandleVerifier [0x0116A7C6+508998]\n\tGetHandleVerifier [0x0116A504+508292]\n\tGetHandleVerifier [0x0117F617+594583]\n\tGetHandleVerifier [0x0116B036+511158]\n\tOrdinal0 [0x01043FFC+1130492]\n\tOrdinal0 [0x0104D49B+1168539]\n\tOrdinal0 [0x0104D603+1168899]\n\tOrdinal0 [0x01065B05+1268485]\n\tBaseThreadInitThunk [0x74FC6359+25]\n\tRtlGetAppContainerNamedObjectPath [0x76FB7C24+228]\n\tRtlGetAppContainerNamedObjectPath [0x76FB7BF4+180]\n\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\r\n\tat java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat steps.Common_Steps.setup(Common_Steps.java:18)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I am Ebay Advanced Search Page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.EbayAdvancedSearch_Steps.i_am_Ebay_Advanced_Search_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I advanced search an item",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "steps.EbayAdvancedSearch_Steps.i_advanced_search_an_item(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException\r\n\tat steps.Common_Steps.tearDown(Common_Steps.java:24)\r\n",
  "status": "failed"
});
});