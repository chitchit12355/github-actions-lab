const fs = require("fs");

if (!fs.existsSync("dist")) {
  fs.mkdirSync("dist");
}

fs.writeFileSync("dist/node-output.txt", "Node.js build output created successfully\n");

console.log("Node.js build completed successfully");
