# Proxy-Pattern-Java
COMP 373/473 - Objects/Frameworks/Patterns - Spring 2016 - Project 3 Proxy Pattern

The purpose of a proxy is to act as an intermediate object between the client and the
target object. The proxy provides a placeholder for another object to control access
to it. In this example, a ProxyImage object is an intermediate object between
the ProxyPattern client and the HighResolutionImage target object. Both the ProxyImage
and HighResolutionImage implement the ImageInterface. By using a proxy image, the real
high resolution is only created when the client asks for it to be displayed. Before
displaying the image, the proxy checks if the image was already created in which case
it will still have a reference to the image. If the proxy still has a reference to the
image, then it will forward the subsequent display requests directly to the image,
 bypass the loading process, and go directly to displaying the image. Proxy is a useful
pattern for this case because it is expensive to load a high resolution image each time
 the display method is called.




Resources used:
- https://en.wikipedia.org/wiki/Proxy_pattern#Java
- Design Patterns by Gamma, Helm, Johnson, and Vlissides (GoF)
