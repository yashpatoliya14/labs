const express = require('express');
const mongoose = require('mongoose');

const app = express();
app.use(express.json()); // Middleware to parse JSON bodies

// Define the schema and model
const facultySchema = new mongoose.Schema({
    name: {
        type: String,
        required: true,
        unique: true
    },
    role: {
        type: String,
        required: true
    }
});

const Faculty = mongoose.model('Faculty', facultySchema);

// Connect to MongoDB
mongoose.connect('mongodb+srv://yashpatoliya14:12345@cluster0.bjsyv.mongodb.net/demo', {
    useNewUrlParser: true,
    useUnifiedTopology: true
})
.then(() => {
    console.log("Connected to MongoDB");

    // Example operations
    Faculty.deleteMany({ name: "yash patoliya" })
    .then(result => console.log(result))
    .catch(err => console.log(err));
})
.catch(err => console.log("MongoDB connection error:", err));

// Start the Express server
app.listen(1000, () => {
    console.log("Server is running on port 1000");
});
