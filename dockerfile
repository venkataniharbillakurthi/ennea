# Step 1: Use Node.js as the build environment
FROM node:18-alpine AS build

WORKDIR /app

# Copy the package.json and install dependencies
COPY package*.json ./
RUN npm install

# Copy the rest of the application code
COPY . .

# Build the React app for production
RUN npm run build

# Step 2: Use Nginx to serve the app
FROM nginx:1.21-alpine

# Copy the build directory from the previous build step
COPY --from=build /app/build /usr/share/nginx/html

# Copy your custom nginx configuration (if you have one)
COPY nginx.conf /etc/nginx/nginx.conf

# Expose port 80
EXPOSE 80

# Start Nginx server
CMD ["nginx", "-g", "daemon off;"]
