/**
 * Cube Assignment.
 * @author jeronosg
 * @version CS 1410
 * 
 */

 // Import Statements
package com.example.project;
import java.util.ArrayList;
import java.util.Scanner;

// Start Of Program
public class Cube {

    // Creating Arrays for each Face
    static String rFace[][] = {
        { "r", "r", "r"},
        { "r", "r", "r"},
        { "r", "r", "r"},
    };
    static String bFace[][] = {
        { "b", "b", "b"},
        { "b", "b", "b"},
        { "b", "b", "b"},
    };
    static String gFace[][] = {
        { "g", "g", "g"},
        { "g", "g", "g"},
        { "g", "g", "g"},
    };
    static String oFace[][] = {
        { "o", "o", "o"},
        { "o", "o", "o"},
        { "o", "o", "o"},
    };
    static String wFace[][] = {
        { "w", "w", "w"},
        { "w", "w", "w"},
        { "w", "w", "w"},
    };
    static String yFace[][] = {
        { "y", "y", "y"},
        { "y", "y", "y"},
        { "y", "y", "y"},
    };

    // Function to Show/Print the Cube
    static void showCube() {
        // Red Face
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(rFace[i][j] + " ");
            }
            System.out.println();
        }
        // Blue Face
        System.out.println();
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(bFace[i][j] + " ");
            }
            System.out.println();
        }
        // Orange Face
        System.out.println();
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(oFace[i][j] + " ");
            }
            System.out.println();
        }
        // Green Face
        System.out.println();
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(gFace[i][j] + " ");
            }
            System.out.println();
        }
        // White Face
        System.out.println();
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(wFace[i][j] + " ");
            }
            System.out.println();
        }
        // Yellow Face
        System.out.println();
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(yFace[i][j] + " ");
            }
            System.out.println();
        }

    }

    // Functions to Create Temp Faces

    // Temp Red Face
    static String[][] rTempFace(String[][] face) {
        String tempFace[][] = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tempFace[i][j] = face[i][j];
            }
        }
        return tempFace;
    }

    // Temp Blue Face 
    static String[][] bTempFace(String[][] face) {
        String tempFace[][] = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tempFace[i][j] = face[i][j];
            }
        }
        return tempFace;
    }

    // Temp Orange Face
    static String[][] oTempFace(String[][] face) {
        String tempFace[][] = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tempFace[i][j] = face[i][j];
            }
        }
        return tempFace;
    }

    // Temp Green Face
    static String[][] gTempFace(String[][] face) {
        String tempFace[][] = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tempFace[i][j] = face[i][j];
            }
        }
        return tempFace;
    }

    // Temp White Face
    static String[][] wTempFace(String[][] face) {
        String tempFace[][] = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tempFace[i][j] = face[i][j];
            }
        }
        return tempFace;
    }

    // Temp Yellow Face
    static String[][] yTempFace(String[][] face) {
        String tempFace[][] = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tempFace[i][j] = face[i][j];
            }
        }
        return tempFace;
    }

    // Function to Rotate the Cube

    static String[][] moveFace(String[][] face){
        String[][] tempTopFace = new String[3][3];
        for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tempTopFace[i][j] = face[i][j];
			}
        }
        face[0][0] = tempTopFace[2][0];
		face[1][0] = tempTopFace[2][1];
		face[2][0] = tempTopFace[2][2];
		face[0][1] = tempTopFace[1][0];
		face[2][1] = tempTopFace[1][2];
		face[0][2] = tempTopFace[0][0];
		face[1][2] = tempTopFace[0][1];
		face[2][2] = tempTopFace[0][2];
        return face;
    }

    // Move Front Up
    static String[][] moveFrontUp(String[][] face) {
        face[0][0] = gFace[0][0];
        face[0][1] = gFace[0][1];
        face[0][2] = gFace[0][2];
        return face;
    }

    // Move Left Up
    static String[][] moveLeftUp(String[][] face, String[][] tempFace) {
        face[0][0] = tempFace[0][0];
        face[0][1] = tempFace[0][1];
        face[0][2] = tempFace[0][2];
        return face;
    }

    // Move Back Up
    static String[][] moveBackUp(String[][] face){
        face[0][0] = bFace[0][0];
        face[0][1] = bFace[0][1];
        face[0][2] = bFace[0][2];
        return face;
    }

    // Move Right Up
    static String[][] moveRightUp(String[][] face){
        face[0][0] = oFace[0][0];
        face[0][1] = oFace[0][1];
        face[0][2] = oFace[0][2];
        return face;
    }

    // Move Front Down
    static String[][] moveFrontDown(String[][] face) {
        face[2][0] = bFace[2][0];
        face[2][1] = bFace[2][1];
        face[2][2] = bFace[2][2];
        return face;
    }

    // Move Left Down
    static String[][] moveLeftDown(String[][] face){
        face[2][0] = oFace[2][0];
        face[2][1] = oFace[2][1];
        face[2][2] = oFace[2][2];
        return face;
    }

    // Move Back Down
    static String[][] moveBackDown(String[][] face){
        face[2][0] = gFace[2][0];
        face[2][1] = gFace[2][1];
        face[2][2] = gFace[2][2];
        return face;
    }

    // Move Right Down
    static String[][] moveRightDown(String[][] face, String[][] tempFace){
        face[2][0] = tempFace[2][0];
        face[2][1] = tempFace[2][1];
        face[2][2] = tempFace[2][2];
        return face;
    }

    // Move Front Right
    static String[][] moveFrontRight(String[][] face){
        face[0][2] = wFace[0][2];
        face[1][2] = wFace[1][2];
        face[2][2] = wFace[2][2];
        return face;
    }

    // Move Bottom Right
    static String[][] moveBottomRight(String[][] face){
        face[0][2] = oFace[2][0];
        face[1][2] = oFace[1][0];
        face[2][2] = oFace[0][0];
        return face;
    }

    // Move Back Right
    static String[][] moveBackRight(String[][] face){
        face[0][2] = yFace[2][2];
        face[1][0] = yFace[1][2];
        face[2][0] = yFace[0][2];
        return face;
    }

    // Move Top Right
    static String[][] moveTopRight(String[][] face, String[][] tempFace){
        face[0][2] = tempFace[0][2];
        face[1][2] = tempFace[1][2];
        face[2][2] = tempFace[2][2];
        return face;
    }

    // Move Front Left
    static String[][] moveFrontLeft(String[][] face){
        face[0][0] = yFace[0][0];
        face[1][0] = yFace[1][0];
        face[2][0] = yFace[2][0];
        return face;
    }
    
    // Move Top Left
    static String[][] moveTopLeft(String[][] face){
        face[0][0] = oFace[2][2];
        face[1][0] = oFace[1][2];
        face[2][0] = oFace[0][2];
        return face;
    }
    
    // Move Back Left
    static String[][] moveBackLeft(String[][] face){
        face[0][0] = wFace[2][0];
        face[1][2] = wFace[1][0];
        face[2][2] = wFace[0][0];
        return face;
    }

    // Move Bottom Left
    static String[][] moveBottomLeft(String[][] face, String[][] tempFace) {
		face[0][0] = tempFace[0][0];
		face[1][0] = tempFace[1][0];
		face[2][0] = tempFace[2][0];
		return face;
	}

    // Move Top Forward
	static String[][] moveTopForward(String[][] face) {
		face[2][2] = bFace[0][2];
		face[2][1] = bFace[1][2];
		face[2][0] = bFace[2][2];
		return face;
	}

    // Move Left Forward
	static String[][] moveLeftForward(String[][] face) {
		face[0][2] = wFace[0][0];
		face[1][2] = wFace[0][1];
		face[2][2] = wFace[0][2];
		return face;
	}

    // Move Bottom Forward
	static String[][] moveBottomForward(String[][] face) {
		face[0][0] = gFace[2][0];
		face[0][1] = gFace[1][0];
		face[0][2] = gFace[0][0];
		return face;
	}

    // Move Right Forward
	static String[][] moveRightForward(String[][] face, String[][] tempFace) {
		face[0][0] = tempFace[2][0];
		face[1][0] = tempFace[2][1];
		face[2][0] = tempFace[2][2];
		return face;
	}

    // Move Top Back
	static String[][] moveTopBack(String[][] face) {
		face[0][0] = gFace[0][2];
		face[0][1] = gFace[1][2];
		face[0][2] = gFace[2][2];
		return face;
	}

    // Move Right Back
	static String[][] moveRightBack(String[][] face) {
		face[0][2] = wFace[2][2];
		face[1][2] = wFace[2][1];
		face[2][2] = wFace[2][0];
		return face;
	}

    // Move Bottom Back
	static String[][] moveBottomBack(String[][] face) {
		face[2][0] = bFace[0][0];
		face[2][1] = bFace[1][0];
		face[2][2] = bFace[2][0];
		return face;
	}

    // Move Left Back
	static String[][] moveLeftBack(String[][] face, String[][] tempFace) {
		face[0][0] = tempFace[0][2];
		face[1][0] = tempFace[0][1];
		face[2][0] = tempFace[0][0];
		return face;
	}

    // Main Program and User Interface
    public static void main(final String[] args){
        Scanner userInput = new Scanner(System.in);
        String[][] tempRFace = new String[3][3];
        String[][] tempYFace = new String[3][3];
        ArrayList<String> reverse = new ArrayList<String>();
        

        System.out.println("Rubik's Cube Simulation. Use the simulation to scrable and solve the cube.");
        System.out.println("Commands: U, D, R, L, F, B, U', D', R', L', F', B'. To view the cube, press V, to quit, press Q.");
        System.out.println("Things to Remember: Red Face is towards you and Yellow is Up");

        String quitCube = "";
        while (quitCube != "Q"){
            quitCube = userInput.next();
            switch (quitCube) {
                
                // Up
                case "U":
                    tempRFace = rTempFace(rFace);
					moveFace(yFace);
					moveFrontUp(rFace);
					moveRightUp(gFace);
					moveBackUp(oFace);
					moveLeftUp(bFace, tempRFace);
					reverse.add("U'");
                    break;
                
                // Down
                case "D":
					tempRFace = rTempFace(rFace);
					moveFace(wFace);
					moveFrontDown(rFace);
					moveLeftDown(bFace);
					moveBackDown(oFace);
					moveRightDown(gFace, tempRFace);
					reverse.add("D'");
					break;
                
                // Right
                case "R":
					tempRFace = rTempFace(rFace);
					moveFace(gFace);
					moveFrontRight(rFace);
					moveBottomRight(wFace);
					moveBackRight(oFace);
					moveTopRight(yFace, tempRFace);
					reverse.add("R'");
					break;
                
                // Left
				case "L":
					tempRFace = rTempFace(rFace);
					moveFace(bFace);
					moveFrontLeft(rFace);
					moveTopLeft(yFace);
					moveBackLeft(oFace);
					moveBottomLeft(wFace, tempRFace);
					reverse.add("L'");
					break;
                
                // Forward
				case "F":
					tempYFace = yTempFace(yFace);
					moveFace(rFace);
					moveTopForward(yFace);
					moveLeftForward(bFace);
					moveBottomForward(wFace);
					moveRightForward(gFace, tempYFace);
					reverse.add("F'");
					break;
                
                // Back
				case "B":
					tempYFace = yTempFace(yFace);
					moveFace(oFace);
					moveTopBack(yFace);
					moveRightBack(gFace);
					moveBottomBack(wFace);
					moveLeftBack(bFace, tempYFace);
					reverse.add("B'");
					break;
                
                // Up Prime
				case "U'":
					for (int i = 0; i < 3; i++) {
						tempRFace = rTempFace(rFace);
						moveFace(yFace);
						moveFrontUp(rFace);
						moveRightUp(gFace);
						moveBackUp(oFace);
						moveLeftUp(bFace, tempRFace);
					}
					reverse.add("U");
					break;
                
                // Down Prime
				case "D'":
					for (int i = 0; i < 3; i++) {
						tempRFace = rTempFace(rFace);
						moveFace(wFace);
						moveFrontDown(rFace);
						moveLeftDown(bFace);
						moveBackDown(oFace);
						moveRightDown(gFace, tempRFace);
					}
					reverse.add("D");
					break;
                
                // Right Prime
				case "R'":
					for (int i = 0; i < 3; i++) {
						tempRFace = rTempFace(rFace);
						moveFace(gFace);
						moveFrontRight(rFace);
						moveBottomRight(wFace);
						moveBackRight(oFace);
						moveTopRight(yFace, tempRFace);
					}
					reverse.add("R");
					break;
                
                // Left Prime
				case "L'":
					for (int i = 0; i < 3; i++) {
						tempRFace = rTempFace(rFace);
						moveFace(bFace);
						moveFrontLeft(rFace);
						moveTopLeft(yFace);
						moveBackLeft(oFace);
						moveBottomLeft(wFace, tempRFace);
					}
					reverse.add("L");
					break;
                
                // Forward Prime
				case "F'":
					for (int i = 0; i < 3; i++) {
						tempYFace = yTempFace(yFace);
						moveFace(rFace);
						moveTopForward(yFace);
						moveLeftForward(bFace);
						moveBottomForward(wFace);
						moveRightForward(gFace, tempYFace);
					}
					reverse.add("F");
					break;
                
                // Back Prime
				case "B'":
					for (int i = 0; i < 3; i++) {
						tempYFace = yTempFace(yFace);
						moveFace(oFace);
						moveTopBack(yFace);
						moveRightBack(gFace);
						moveBottomBack(wFace);
						moveLeftBack(bFace, tempYFace);
					}
					reverse.add("B");
					break;
                
                // View Cube
                case "V":
                    showCube();
                    break;
                
                // Quit Cube
                case "Q":
                    System.out.println("Rubik's Cube End.");
                    System.out.println("Moves to solve: ");
                    for (int i = reverse.size(); i > 0; i--) {
						System.out.print(reverse.get(i-1) + " ");
					}
                    break;
                
                // Invalid Input
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
        userInput.close();
    }

}
