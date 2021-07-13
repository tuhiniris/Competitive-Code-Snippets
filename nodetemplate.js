// NODEJS (Node 7.4.0) 
let inputStr = "";
const _toInt = (x) => +x;
process.stdin.resume();
process.stdin.setEncoding("utf8");
process.stdin.on("data", (chunk) => (inputStr += chunk));

//TESTCASE CODE HERE
process.stdin.on("end", () => {
    const inputLinesArr = inputStr.split("\n");
    let T = inputLinesArr.shift();
    console.log(inputLinesArr);

    for (let i = 0; i < T; i++) {
        //let a = inputLinesArr[i] // each test case
        //let [a,b] = inputLinesArr[i].split(" ").map(_toInt); // A,B format
        //let arr = [];
        //arr = inputLinesArr[i].split(" ").map(_toInt); // Array format
    }
    
});