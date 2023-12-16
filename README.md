Please find below steps to download, extract, and run Redis. Please note that software versions may change over time, so make sure to check the official Redis website for the latest version.

1. **Download Redis:**

   Visit the official Redis download page at https://redis.io/download and get the link to the latest stable release. You can use `wget` or `curl` in your terminal to download it. For example:

   wget http://download.redis.io/releases/redis-x.x.x.tar.gz

   Replace "x.x.x" with the actual version number.

   Or using `curl`:

   ```bash
   curl -O http://download.redis.io/releases/redis-x.x.x.tar.gz
   ```
2. **Extract the tar file:**

   Use the following command to extract the tar file:

   ```bash
   tar xzf redis-x.x.x.tar.gz
   ```

   This will create a directory named `redis-x.x.x`. Navigate into the directory:

   ```bash
   cd redis-x.x.x
   ```

3. **Compile Redis:**

   Go to the `src` directory:

   ```bash
   cd src
   ```

   Compile Redis by running:

   ```bash
   make
   ```

4. **Run Redis Server:**

   After compiling, you should see the `redis-server` executable in the same `src` directory. Run it:

   ```bash
   ./redis-server
   ```

   This will start the Redis server.

5. **Run Redis CLI:**

   Open a new terminal window, navigate to the Redis directory (where you extracted the tar file), and go to the `src` directory:

   ```bash
   cd /path/to/redis-x.x.x/src
   ```

   Run the Redis CLI:

   ```bash
   ./redis-cli
   ```

   Now you should be connected to the running Redis server, and you can start interacting with it.

Remember to replace "x.x.x" with the actual version number you downloaded. Also, make sure you have the necessary build tools and dependencies installed on your system for the compilation process.
