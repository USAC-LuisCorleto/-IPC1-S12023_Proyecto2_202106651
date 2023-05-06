package Imágenes;

import java.io.*;

/**
 * BmpHandlerCopy class es una subclase de ImageHandler. A BmpHandlerCopy object
 * lets us handle an original bmp file by being able of making an exact copy of
 * it.
 *
 * @author Jorge Daniel Monterroso Nowell - @jorged104
 * @version 1.0
*
 */
public class BmpHandlerCopy extends ImageHandler {

    /**
     * Array of bytes that will allocate all header and data for original file
	*
     */
    protected byte[] filebytes;
    /**
     * File name that will be given to the copy of the original file
	*
     */
    protected String copyname;

    /**
     * Builds and returns a BmpHandlerCopy object which handles the file
     * represented by the given name
     *
     * @param imagename Name of the original file being handled by this object
	*
     */
    public BmpHandlerCopy(String imagename) {
        super(imagename);
        this.copyname = "copy-" + imagename;
    }

    /**
     * Reads handled file header and data in bytes
	*
     */
    @Override
    public void readFile() throws Exception {
        FileInputStream input = new FileInputStream(this.handledFileName);
        filebytes = new byte[input.available()];
        input.read(filebytes);
        input.close();
        System.out.println("Imagen leida: " + this.handledFileName);
    }

    /**
     * Generates a copy file from the original file. The name of the generated
     * file will be build by the same name preceeded of "copy-"
	*
     */
    @Override
    public void generateFiles() throws Exception {
        FileOutputStream output = new FileOutputStream(copyname);
        output.write(filebytes);
        output.close();
        System.out.println("Imagen generada: " + copyname);
    }
}
