# java-spi-demo
## Overview
**java-spi-demo** is intended as a proof of concept and to show developers a pattern to use when implementing their own input Adapter to be used in the AIXM Ingestion Service.
The three top-level folders: api, axl and app show how the Java SPI pattern is used to provide pluggable input adapters to the Ingestion Service.
Using an iNM Digitial Product (DP) that needs to connect to and fetch AIXM data from ADM as an example, the following steps should be followed to implement the pluggable adapter:
1. Create a git project to hold the code that produces the Adapter implementation library as a jar file.
2. Include the api jar as a dependency
3. Following the example shown in the axl folder:
   - Create a class called, say, **AdmInputPullAdapter** that extends **InputPullAdapter** (defined in the api library)
   - Implement the contructor in the same way and adding any extra initialisation logic as required.
   - Override the **start()** method with logic that:
     - establishes a connection to the source (ADM WFS-TE interface),
     - creates a **PipedOUtputStream** connected to the supplied **PipedInputStream**
     - reads bytes from that source and sends them to the local **PipedOutputStream** (see the **FileInputPullAdapter ** class in the **api** source tree for inspiration)
   - Create a class called, say, **AdmIinputPullAdapterProvider** that extends **InputPullAdapterProvider** (defined in the api library)
   - Override the **create()** method to return an instance of **AdmInputPullAdapter** that passes the **properties** and **PipedIntputStream** arguments to the constructor.
   - Create a file called **com.chthonics.prototypes.javaspidemo.api.InputPullAdapterProvider** in the **src/main/resources/META-INF/services** folder (create folders as necessary) which has a single line containg the fully qualified class name for **AdmInputP{ullAdapterProvider** class
   - Build into a jar and place that jar into a folder that is on the classpath of the AIXM Ingestion Service
